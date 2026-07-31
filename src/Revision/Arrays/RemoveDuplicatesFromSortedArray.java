package Revision.Arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    static public int removeDuplicates(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!s.contains(nums[i])) {
                s.add(nums[i]);
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicates(arr);
        System.out.println(result);
    }
}
