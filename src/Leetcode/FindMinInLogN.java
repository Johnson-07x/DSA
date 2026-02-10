package Leetcode;
//Arrays problem

class Solution5 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}

public class FindMinInLogN {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2};
        Solution5 s5 = new Solution5();
        System.out.println(s5.findMin(arr));
    }
}
