package Leetcode;

import java.util.Arrays;

// Leetcode no.2574
public class LeftAndRightSumDiff {
    static int calculateLeft(int[] nums, int index) {
        int sum = 0;
        if (index == 0) return sum;

        for (int i = index - 1; i >= 0; i--) {
            sum += nums[i];
        }

        return sum;
    }

    static int calculateRight(int[] nums, int index) {
        int sum = 0;
        if (index == nums.length - 1) return sum;

        for (int i = index + 1; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }

    static public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        for (int i = 0; i < n; i++) {
            leftSum[i] = calculateLeft(nums, i);
        }

        for (int i = 0; i < n; i++) {
            rightSum[i] = calculateRight(nums, i);
        }

        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return nums;
    }

    static void main(String[] args) {
        int[] nums = {10,4,8,3};
        int[] result = leftRightDifference(nums);
        System.out.println(Arrays.toString(result));
    }
}
