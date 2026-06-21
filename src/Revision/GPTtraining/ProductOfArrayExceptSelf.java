package Revision.GPTtraining;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int process(int[] arr, int index, int except, int sum) {
        if (index == arr.length) return sum;

        if (index == except) return process(arr, index + 1, except, sum);
        else return process(arr, index + 1, except, sum * arr[index]);
    }

    public static int[] findProduct(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = process(arr, 0, i, 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = findProduct(arr);
        System.out.println(Arrays.toString(result));
    }
}
