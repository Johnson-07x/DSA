package Leetcode;

import java.util.*;

// Leetcode no.90
public class Subsets2 {
    static public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        // Hashset can store unique value
        Set<List<Integer>> result = new LinkedHashSet<>();
        result.add(new ArrayList<>());

        for (int num : nums) {
            List<List<Integer>> currentSubset = new ArrayList<>(result);
            for (List<Integer> curr : currentSubset) {
                List<Integer> subset = new ArrayList<>(curr);
                subset.add(num);
                result.add(subset);
            }
        }
        return new ArrayList<>(result);
    }

    static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> result = subsetsWithDup(nums);
        System.out.println(result);
    }
}
