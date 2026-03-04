package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaxNumOfVowelsInSubString {
    static public int maxVowels(String s, int k) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int max = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < k) {
                if (set.contains(s.charAt(i))) {
                    count++;
                }
            }
            if (i >= k) {
                if (set.contains(s.charAt(i - k))) {
                    count--;
                }
                if (set.contains(s.charAt(i))) {
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }

    static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }
}
