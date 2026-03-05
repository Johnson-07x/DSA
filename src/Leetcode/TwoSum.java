package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Leetcode no.1
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (map.containsKey(remaining)) {
                return new int[]{i, map.get(remaining)};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
