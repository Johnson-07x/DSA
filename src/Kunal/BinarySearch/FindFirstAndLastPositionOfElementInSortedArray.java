package Kunal.BinarySearch;

import java.util.Arrays;

// Leetcode no.34
public class FindFirstAndLastPositionOfElementInSortedArray {
    static public int binarySearch(int[] arr, int target, boolean startsFirst) {
        int start = 0;
        int end = arr.length - 1;

        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                if (startsFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    static public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = binarySearch(nums, target, true);
        result[1] = binarySearch(nums, target, false);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] result = searchRange(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
