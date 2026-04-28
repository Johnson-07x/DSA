package Leetcode;

import java.util.HashMap;
import java.util.Map;

// to be continued../
// Leetcode no.567
public class PermutationInString {
    static public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> s1Count = new HashMap<>();
        Map<Character, Integer> s2Count = new HashMap<>();
        for (char c : s1.toCharArray()) {
            s1Count.put(c, s1Count.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            s2Count.put(c, s2Count.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (s1Count.containsKey(c)) {
                if (s1Count.get(c) < s2Count.get(c)) return false;
            }
        }

        return true;
    }

    static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean result = checkInclusion(s1, s2);
        System.out.println(result);
    }
}
