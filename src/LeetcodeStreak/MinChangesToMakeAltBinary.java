package LeetcodeStreak;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Leetcode no.1758
public class MinChangesToMakeAltBinary {
    static public int minOperations(String s) {
        if (s.length() <= 2) {
            return 0;
        }
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                s1 += '0';
                s2 += '1';
            } else {
                s1 += '1';
                s2 += '0';
            }
        }

        int min = Integer.MAX_VALUE;
        int s1count = 0;
        int s2count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s1.charAt(i)) {
                s1count++;
            }
            if (s.charAt(i) != s2.charAt(i)) {
                s2count++;
            }
        }
        min = Math.min(s1count, s2count);

        return min;
    }

    static void main(String[] args) {
        String s = "10010100";
        int result = minOperations(s);
        System.out.println(result);
    }
}
