// package sorting;

import java.util.Arrays;

public class SelectionSortExample {

    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};
        
        // We print the array's current state before any sorting.
        // Arrays.toString() is a helper method to make the array look nice.
        System.out.println("Original array: " + Arrays.toString(arr));
        
        // This is where we call our sorting method. We pass the 'arr'
        // array into it. The method will modify the array directly.
        selectionSort(arr); 
        
        // After the selectionSort(arr) method is finished, we print
        // the array again to show that it is now sorted.
        System.out.println("Sorted array:   " + Arrays.toString(arr));

        
    }


    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0; i < n-1; i++){
            int minIndex= i;


            for(int j = i+1; j<n ; j++){
                
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            
        }
    }
    
}
