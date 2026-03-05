package Sorting;

import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int pivot = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > pivot) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = pivot;
        }
    }

    static void main(String[] args) {
        int[] arr = {68,21,74,75,16,18,33,72,90};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
