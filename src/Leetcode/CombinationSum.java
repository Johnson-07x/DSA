package Leetcode;

import java.util.ArrayList;
import java.util.List;

// Leetcode no.39
public class CombinationSum {
    static public void backTracking(int[] candidates, int target,List<List<Integer>> result, List<Integer> sum, int index) {
        if (target == 0) {
            result.add(new ArrayList<>(sum));
            return ;
        }
        if (target < 0) return;
        for (int i = index; i < candidates.length; i++) {
            sum.add(candidates[i]);
            backTracking(candidates, target - candidates[i], result, sum, i );
            sum.removeLast();
        }
    }

    static public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
        backTracking(candidates, target, result, sum, 0);
        return result;
    }

    static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> result = combinationSum(candidates, target);
        System.out.println(result);
    }
}
