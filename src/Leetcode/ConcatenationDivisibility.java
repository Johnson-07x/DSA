package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcatenationDivisibility {
    static public int[] concatenatedDivisibility(int[] nums, int k) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        permutations(nums, result, 0);
        for (ArrayList<Integer> al : result) {
            StringBuilder temp = new StringBuilder();
            for (int n : al) {
                temp.append(n);
            }
            int val = Integer.parseInt(temp.toString());
            if (val % k == 0) return al.stream().mapToInt(i -> i).toArray();
        }

        return new int[0];
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void permutations(int[] arr, ArrayList<ArrayList<Integer>> result, int idx) {
        if (idx == arr.length) {
            ArrayList<Integer> permutation = new ArrayList<>();
            for (int n : arr) {
                permutation.add(n);
            }
            result.add(permutation);
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            swap(arr, i, idx);
            permutations(arr, result, idx + 1);
            swap(arr, i, idx);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,12,45};
        int[] result = concatenatedDivisibility(arr, 5);
        System.out.println(Arrays.toString(result));
    }
}
