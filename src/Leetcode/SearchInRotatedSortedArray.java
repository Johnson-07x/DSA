package Leetcode;

class Solution4 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= nums[left]) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}

public class SearchInRotatedSortedArray {
    static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        Solution4 s4 = new Solution4();
        System.out.println(s4.search(arr, target));
    }
}
