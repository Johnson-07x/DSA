package Revision.Arrays;

import java.util.Arrays;

public class RemoveElement {
    static public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    public void main(String[] args) {
        int[] arr = {3,2,2,3};
        int val = 3;

        int result = removeElement(arr, val);
    }
}
