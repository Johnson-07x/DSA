package Leetcode;

import java.util.Arrays;

// Leetcode
public class SortColors {
    static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                int temp = min;
                arr[i] = temp;
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
