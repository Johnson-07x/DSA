package Revision.GPTtraining;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void moveZerosToEnd(int[] arr) {
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
