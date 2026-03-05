package Sorting;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        // This loop represents upto where it needs to iterate
        for (int i = 0; i < n - 1; i++) {
            boolean swap = false;
            // Checks and swaps the num
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    static void main(String[] args) {
        int[] arr = {21,74,75,16,18,33,72,90};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
