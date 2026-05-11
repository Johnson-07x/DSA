package Leetcode;

import java.util.Arrays;

// Leetcode no.673
public class NumberOfLongestIncreasingSubsequence {
    static public int findNumberOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] lengths = new int[n]; // lengths[i] = length of LIS ending at index i
        int[] counts = new int[n];  // counts[i] = number of LIS ending at index i

        Arrays.fill(lengths, 1);
        Arrays.fill(counts, 1);

        // For each element, check all previous elements
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    // If we can extend the subsequence ending at j
                    if (lengths[j] + 1 > lengths[i]) {
                        // Found a longer subsequence
                        lengths[i] = lengths[j] + 1;
                        counts[i] = counts[j];
                    } else if (lengths[j] + 1 == lengths[i]) {
                        // Found another subsequence of the same maximum length
                        counts[i] += counts[j];
                    }
                }
            }
        }

        // Find the maximum length
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            maxLen = Math.max(maxLen, lengths[i]);
        }

        // Sum up counts for all positions with maximum length
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (lengths[i] == maxLen) {
                result += counts[i];
            }
        }

        System.out.println(Arrays.toString(counts));
        System.out.println(Arrays.toString(lengths));
        return result;
    }

    static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        int result = findNumberOfLIS(nums);
        System.out.println(result);
    }
}
