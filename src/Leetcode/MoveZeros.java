package Leetcode;

import java.util.Arrays;

// Leetcode no. 283
public class MoveZeros {
    static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

//        int i = 0;
//        int j = 0;
//        while (i < arr.length) {
//            if (arr[j] != 0) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                i++;
//                j++;
//            } else {
//                i++;
//            }
//        }
        // above given is "Kiruba" sir method
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
