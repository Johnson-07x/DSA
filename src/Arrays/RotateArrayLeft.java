package Arrays;

import java.util.Arrays;

public class RotateArrayLeft {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int x = k % arr.length;
        int[] newArr = new int[arr.length];

        int index = 0;
        for (int i = x; i < arr.length; i++) {
            newArr[index] = arr[i];
            index++;
        }
        for (int i = 0; i < x; i++) {
            newArr[index] = arr[i];
            index++;
        }
        System.out.println(Arrays.toString(newArr));
    }
}