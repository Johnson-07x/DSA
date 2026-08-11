package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    static public int missingInteger(int[] nums) {
        int total = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                total += nums[i];
            } else break;
        }

        Set<Integer> s = new HashSet<>();
        for (int n : nums) {
            s.add(n);
        }

        while (s.contains(total)) {
            total++;
        }

        return total;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,12,14,13};
        int result = missingInteger(nums);
        System.out.println(result);
    }
}
