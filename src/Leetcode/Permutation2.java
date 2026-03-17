package Leetcode;

import java.util.ArrayList;
import java.util.List;

// Leetcode no.47
public class Permutation2 {
    static public void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, boolean[] taken) {

        if (temp.size() == nums.length) {
            if (!result.contains(temp)) {
                result.add(new ArrayList<>(temp));
            }
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (taken[i]) {
                continue;
            }
            temp.add(nums[i]);
            taken[i] = true;
            backtrack(result, temp, nums, taken);
            taken[i] = false;
            temp.removeLast();
        }
    }

    static public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] taken = new boolean[nums.length];
        backtrack(result, temp, nums, taken);
        return result;
    }

    static void main(String[] args) {
        int[] arr = {1,1,2};
        List<List<Integer>> result = permuteUnique(arr);
        System.out.println(result);
    }
}
