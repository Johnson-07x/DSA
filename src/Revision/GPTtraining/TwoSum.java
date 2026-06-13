package Revision.GPTtraining;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSumIndexes(int[] arr, int target) {
        if (arr == null || arr.length < 2) return new int[] {};

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumIndexes(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
