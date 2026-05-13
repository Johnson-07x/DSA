package Leetcode;

import java.util.ArrayList;
import java.util.List;

// Leetcode no.78
public class Subsets {
    static public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num : nums) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(num);
                result.add(subset);
            }
        }

        return result;
    }

    static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = subsets(nums);
        System.out.println(result);
    }
}
