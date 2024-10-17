package p1;
import java.util.Scanner;

public class AbusiveWordFilter {
    public static String filterAbusiveWords(String sentence) {
        String[] abusiveWords = {"dog", "stupid", "idiot"};
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (String abusiveWord : abusiveWords) {
                if (words[i].equalsIgnoreCase(abusiveWord)) {
                    words[i] = generateHashString(abusiveWord.length());
                }
            }
        }


        return String.join(" ", words);
    }
    public static String generateHashString(int length) {
        StringBuilder hashString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            hashString.append('#');
        }
        return hashString.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String inputSentence = sc.nextLine();
        String filteredSentence = filterAbusiveWords(inputSentence);
        System.out.println("Filtered output: " + filteredSentence);
    }
}
