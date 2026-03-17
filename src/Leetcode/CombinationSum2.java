package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Leetcode no.40
public class CombinationSum2 {
    static public void backtracking(int[] candidates, int target, List<List<Integer>> result, List<Integer> sum, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(sum));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;

            sum.add(candidates[i]);
            backtracking(candidates, target - candidates[i], result, sum, i + 1);
            sum.remove(sum.size() - 1);
        }
    }

    static public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
        backtracking(candidates, target, result, sum, 0);
        return result;
    }

    static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> result = combinationSum2(candidates, target);
        System.out.println(result);
    }
}