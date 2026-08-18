package Leetcode;

public class MinimumSizeSubarraySum {
    static public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                if (sum >= target) {
                    int len = i - left + 1;
                    min = Math.min(min, len);
                }
                sum -= nums[left++];
            }
        }

        return (min == Integer.MAX_VALUE) ? 0 : min;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int result = minSubArrayLen(7, arr);
        System.out.println(result);
    }
}
