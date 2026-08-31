package Leetcode;

// Leetcode no.713
public class SubarrayProductLessThanK {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int n = nums.length;
        int left = 0;

        int prod = 1;
        int count = 0;
        for (int right = 0; right < n; right++) {
            prod *= nums[right];

            while (prod >= k) {
                prod /= nums[left++];
            }

            count += (right - left + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10,5,2,6};
        int result = numSubarrayProductLessThanK(arr, 100);
        System.out.println(result);
    }
}
