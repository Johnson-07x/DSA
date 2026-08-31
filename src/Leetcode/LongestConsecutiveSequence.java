package Leetcode;

import java.util.HashSet;
import java.util.Set;

// Leetcode no.128
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int longestStreak = 0;

        for (int n : set) {
            if (!set.contains(n - 1)) {
                int currentNum = n;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        int result = longestConsecutive(arr);
        System.out.println(result);
    }
}
