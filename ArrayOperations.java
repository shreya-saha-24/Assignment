import java.util.Scanner;

public class ArrayOperations {
    public int occurenceOfNumber(int[] arr, int number) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == number)
                count++;
        }
        return count;
    }

    public int[] insertElementAny(int[] arr, int number, int position) {
        int n = arr.length;
        int[] newArr = new int[n + 1];
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        newArr[position] = number;

        for (int i = position; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    public int[] removeElementAny(int arr[], int position) {
        int n = arr.length;
        if (position >= n || position < 0) {
            System.out.println("Invalid position");
            return arr;
        }
        int[] newArr = new int[n - 1];
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        for (int i = position + 1; i < n; i++) {
            newArr[i - 1] = arr[i];
        }
        return newArr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size:");
        int n = sc.nextInt();

        
        System.out.println("Number to insert/remove/check occurence:");
        int number = sc.nextInt();
        System.out.println("Position:");
        int position = sc.nextInt();

     
        int[] array = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

       
        ArrayOperations ao = new ArrayOperations();

       
        int result = ao.occurenceOfNumber(array, number);
        System.out.println("Occurrences of " + number + ": " + result);

 
        array = ao.insertElementAny(array, number, position);  
        System.out.println("Array after insertion:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        array = ao.removeElementAny(array, position); 
        System.out.println("Array after removal:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
