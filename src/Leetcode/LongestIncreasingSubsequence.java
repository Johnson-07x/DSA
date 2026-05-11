package Leetcode;

import java.util.Arrays;

// Leetcode no.300
public class LongestIncreasingSubsequence {
    static public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1); // Every single element is an IS of length 1
        int maxOverall = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // If the current element is greater than the previous element
                if (nums[j] < nums[i]) {
                    // Update dp[i] to be the maximum of its current value
                    // or the subsequence ending at j + 1
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxOverall = Math.max(maxOverall, dp[i]);
        }

        System.out.println(Arrays.toString(dp));
        return maxOverall;
    }

    static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int result = lengthOfLIS(nums);
        System.out.println(result); // Expected output: 4 ([2, 3, 7, 18] or [2, 5, 7, 101] etc.)
    }
}