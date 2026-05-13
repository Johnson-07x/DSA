package Arrays;

import java.util.Arrays;

// Leetcode Q2
public class ShuffleTheArray {
    static public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] ans = new int[len];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            ans[idx] = nums[i];
            idx += 2;
        }

        idx = 1;
        for (int i = n; i < len; i++) {
            ans[idx] = nums[i];
            idx += 2;
        }

        return ans;
    }

    static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] result = shuffle(nums, n);
        System.out.println(Arrays.toString(result));
    }
}
