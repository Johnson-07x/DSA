package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LargestInteger {
    public static int largestInteger(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= n - k; i++) {
            Set<Integer> s = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                s.add(nums[j]);
            }

            for (int num : s) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int max = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                max = Math.max(max, entry.getKey());
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3,9,7,2,1,7};
        int k = 4;
        int result = largestInteger(arr, k);
        System.out.println(result);
    }
}
