package Leetcode;


// Leetcode no.643
class Solution17 {
    public double findMaxAverage(int[] nums, int k) {
        double currentWindow = 0;
        double maxWindow = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currentWindow += nums[i];
            if (i >= k - 1) {
                maxWindow = Math.max(currentWindow, maxWindow);
                currentWindow -= nums[i - k + 1];
            }
        }
        return maxWindow / k;
    }
}

public class MaxAvgSubarray {
    static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        Solution17 s17 = new Solution17();
        System.out.println(s17.findMaxAverage(nums, k));
    }
}
