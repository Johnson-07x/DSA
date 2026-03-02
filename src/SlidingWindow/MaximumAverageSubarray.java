package SlidingWindow;

public class MaximumAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        int start = 0;
        double max = 0;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            if (end >= k - 1) {
                max = Math.max(max, sum);
                sum -= nums[start];
                start++;
            }
        }

        return max / k;
    }

    static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(arr, k));
    }
}
