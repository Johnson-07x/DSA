package Leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        int majority = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                majority = entry.getKey();
            }
        }
        return majority;
    }
}

public class MajorityElement {
    static void main(String[] args) {
        int arr[] = {3, 2, 4, 1, 1, 3, 1, 4, 5};
        Solution2 s2 = new Solution2();
        System.out.println(s2.majorityElement(arr));
    }
}
