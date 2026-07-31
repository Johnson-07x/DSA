package LavendelFinalReharsal;

import java.util.Arrays;

public class SortColors {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static public int[] sortColors(int[] nums) {
        if (nums == null || nums.length == 0) return nums;
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        int[] result = sortColors(arr);
        System.out.println(Arrays.toString(result));
    }
}
