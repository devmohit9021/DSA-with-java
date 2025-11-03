// package sorting;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {23, 43, 12, 54};
        
        // Print the array before sorting
        System.out.println("Original array: " + Arrays.toString(arr));

        // Call your bubble sort method
        bubble(arr);
        
        // Print the array after sorting
        System.out.println("Sorted array:   " + Arrays.toString(arr));
    }

    /**
     * Sorts an array in place using the Bubble Sort algorithm.
     * This is your correct logic.
     */
    public static void bubble(int[] arr) {

        int n = arr.length;
        boolean swapped;

        // Outer loop for each pass
        for (int i = 0; i < n - 1 ; i++) {
            swapped = false;

            // Inner loop for comparing and swapping adjacent elements
            // The 'n - 1 - i' optimization avoids re-checking elements
            // that have already "bubbled" to the end.
            for (int j = 0; j < n - 1 - i; j++) {

                // If the element is larger than the next one, swap
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Mark that a swap happened
                }
            }

            // If no swaps occurred in this entire pass,
            // the array is already sorted, and we can stop early.
            if (!swapped) {
                break;
            }
        }
    }
}