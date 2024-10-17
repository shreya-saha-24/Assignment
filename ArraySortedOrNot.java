import java.util.Scanner;

public class ArraySortedOrNot {
    public void isArraySorted(int[] arr) {
        boolean isSorted = true;  // Assume the array is sorted initially
        int n = arr.length;

        // Check if the array is sorted in ascending order
        for (int i = 0; i < n - 1; i++) {  // Go until the second last element
            if (arr[i] > arr[i + 1]) {  // If an element is greater than the next one
                isSorted = false;  // The array is not sorted
                break;  // No need to continue checking
            }
        }

        // Print result based on the flag
        if (isSorted)
            System.out.println("The array is sorted");
        else
            System.out.println("The array is not sorted");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        ArraySortedOrNot as = new ArraySortedOrNot();
        as.isArraySorted(array);
    }
}
