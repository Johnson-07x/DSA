package LeetcodeStreak;

import java.util.*;

// Leetcode no.3116
public class KthSmallestAmtWithSingleDenominationCombination {
    public static long findKthSmallest(int[] coins, int k) {
        Set<Long> list = new TreeSet<>();
        for (int c : coins) {
            for (int i = 1; i <= k; i++) {
                list.add(((long) c * i));
            }
        }

        List<Long> result = new ArrayList<>(list);

        return result.get(k - 1);
    }

    public static void main(String[] args) {
        int[] coins = {5, 2};
        int k = 7;
        long result = findKthSmallest(coins, k);
        System.out.println(result);
    }
}
