package Leetcode;

import java.util.LinkedList;

// Leetcode no.3
public class LongestSubstringWithoutRepeatingChars {
    static public int lengthOfLongestSubstring(String s) {
        LinkedList<Character> window = new LinkedList<>();
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            while (window.contains(ch)) {
                window.removeFirst();
            }

            window.addLast(ch);
            maxLen = Math.max(maxLen, window.size());
        }

        return maxLen;
    }

    static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s)); // Output: 3
    }
}

