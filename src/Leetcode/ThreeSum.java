package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Leetcode no.15
public class ThreeSum {
    static public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort to use two pointers and handle duplicates

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip the same element to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for the second and third elements
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Need a larger value
                } else {
                    right--; // Need a smaller value
                }
            }
        }
        return result;
    }

    static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(arr);
        System.out.println(result);
    }
}
