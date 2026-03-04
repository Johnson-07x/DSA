package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Leetcode no.167
public class TwoSum2 {
    static public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int remaining = target - numbers[i];

            if (map.containsKey(remaining)) {
                 return new int[] {map.get(remaining), i + 1};
            }

            map.put(numbers[i], i + 1);
        }

        return new int[] {};
    }

    static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
