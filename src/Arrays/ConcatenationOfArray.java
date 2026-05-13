package Arrays;

import java.util.Arrays;

// Leetcode Q1
public class ConcatenationOfArray {
    static public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] result = getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
}
