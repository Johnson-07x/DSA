package Leetcode;

class Solution15 {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

public class FindPeakElement {
    static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        Solution15 s15 = new Solution15();
        int result = s15.findPeakElement(arr);
        System.out.println(result);
    }
}
