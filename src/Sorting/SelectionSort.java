package Sorting;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    static void main(String[] args) {
        int[] arr = {21,74,75,16,18,33,72,90};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
