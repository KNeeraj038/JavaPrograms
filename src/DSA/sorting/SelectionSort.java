package DSA.sorting;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = new int[10];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println("Original Array: "+ Arrays.toString(arr));

        sortUsingSelectionSort(arr);

        System.out.println("Sorted Array: "+ Arrays.toString(arr));
    }

    private static void sortUsingSelectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            // Do Swap
            if(minIndex != i){
                arr[i] = arr[minIndex];
                arr[minIndex] = min;
            }

            System.out.println("Sorting Iteration: ["+(i+1)+"] "+Arrays.toString(arr));
        }
    }
}
