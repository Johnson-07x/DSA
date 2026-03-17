package Leetcode;

import java.util.ArrayList;
import java.util.List;

// Leetcode no.46
public class Permutations {
    static public void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!temp.contains(nums[i])) {
                temp.add(nums[i]);
                backtrack(result, temp, nums);
                temp.removeLast();
            }
        }
    }

    static public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(result, temp, nums);
        return result;
    }

    static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> result = permute(arr);
        System.out.println(result);
    }
}