package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void backtrack(int[] arr, int start, List<List<Integer>> result) {
        if (start == arr.length) {
            List<Integer> current = new ArrayList<>();
            for (int n : arr) {
                current.add(n);
            }
            result.add(current);
        }

        for (int i = start; i < arr.length; i++) {
            swap(arr, start, i);
            backtrack(arr, start + 1, result);
            swap(arr, start, i);
        }
    }

    public static List<List<Integer>> findPermutations(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr, 0, result);
        return result;
    }

    public static void nextPermutation(int[] nums) {
        List<List<Integer>> result = findPermutations(nums);
        int n = result.size();
        int idx = result.indexOf(Arrays.asList(nums));
        System.out.println(idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,5};
        nextPermutation(arr);
    }
}
