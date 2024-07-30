package DSA.sorting;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = new int[10];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println("Original Array: "+ Arrays.toString(arr));

        sortUsingBubbleSort(arr);

        System.out.println("Sorted Array: "+ Arrays.toString(arr));
    }

    private static void sortUsingBubbleSort(int[] arr) {


        for (int i = 0; i < arr.length-1; i++) {

            for(int j =0; j < arr.length-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            System.out.println("Sorting Iteration: ["+(i+1)+"] "+Arrays.toString(arr));

        }

    }
}
