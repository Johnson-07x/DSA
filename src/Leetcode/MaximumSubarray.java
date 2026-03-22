package Leetcode;

// Leetcode no.53
public class MaximumSubarray {
    static public int maxSubArray(int[] nums) {
        int max = nums[0];
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            max = Math.max(current, max);
        }
        return max;
    }

    static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(arr);
        System.out.println(result);
    }
}
