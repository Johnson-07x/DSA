package Leetcode;

import java.util.Arrays;

// Leetcode
public class SortColors {
    static private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static public void sortColors(int[] nums) {
        int low = 0;           // Boundary for 0s
        int mid = 0;           // Current element
        int high = nums.length - 1; // Boundary for 2s

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++; // Already in the right "zone" for now
            } else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
                // Note: We don't increment mid here because the swapped
                // value from 'high' still needs to be checked.
            }
        }
    }

    static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
