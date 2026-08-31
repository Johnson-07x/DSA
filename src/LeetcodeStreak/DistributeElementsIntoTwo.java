package LeetcodeStreak;

import java.util.Arrays;
import java.util.LinkedList;

public class DistributeElementsIntoTwo {
    public static int[] resultArray(int[] nums) {
        if (nums.length == 2) return nums;
        int[] result = new int[nums.length];
        int idx = 0;
        LinkedList<Integer> temp = new LinkedList<>();
        result[0] = nums[0];
        temp.add(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (result[idx] > temp.getLast()) {
                result[++idx] = nums[i];
            } else {
                temp.add(nums[i]);
            }
        }

        while (!temp.isEmpty()) {
            result[++idx] = temp.pollFirst();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,8};
        int[] result = resultArray(arr);
        System.out.println(Arrays.toString(result));
    }
}
