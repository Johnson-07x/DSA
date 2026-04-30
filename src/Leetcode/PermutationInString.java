package Leetcode;

import java.util.HashMap;
import java.util.Map;

// Leetcode no.567
public class PermutationInString {
    static public boolean checkValid(String s1, String s2) {
        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> s2Map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            s2Map.put(c, s2Map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : s1Map.entrySet()) {
            if (!s2Map.containsKey(entry.getKey())) return false;
            if (!entry.getValue().equals(s2Map.get(entry.getKey()))) return false;
        }

        return true;
    }

    static public boolean checkInclusion(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();
        for (int i = 0; i < s2Length - s1Length + 1; i++) {
            if (checkValid(s1, s2.substring(i, i + s1Length))) return true;
        }
        return false;
    }

    static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";
        boolean result = checkInclusion(s1, s2);
        System.out.println(result);
    }
}
