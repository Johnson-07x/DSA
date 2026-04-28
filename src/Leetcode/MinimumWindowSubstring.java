package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        // Frequency map for characters in t
        Map<Character, Integer> required = new HashMap<>();
        for (char c : t.toCharArray()) {
            required.put(c, required.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0;
        int formed = 0; // Number of unique characters in t satisfied by current window

        // Tracking the best window found so far
        int minLen = Integer.MAX_VALUE;
        int startIdx = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            // If this char is required and its count matches, increment 'formed'
            if (required.containsKey(c) && window.get(c).intValue() == required.get(c).intValue()) {
                formed++;
            }

            // Try to shrink the window from the left while it's valid
            while (formed == required.size()) {
                // Update minimum window result
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIdx = left;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);

                // If removing leftChar makes the window invalid, decrement 'formed'
                if (required.containsKey(leftChar) && window.get(leftChar) < required.get(leftChar)) {
                    formed--;
                }
                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIdx, startIdx + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = minWindow(s, t);
        System.out.println("Result: " + result); // Output: "BANC"
    }
}
