package Revision.GPTtraining;

import java.util.LinkedList;

public class LongestSubstringWithoutRepCharacters {
    public static int longestSubstring(String s) {
        LinkedList<Character> window = new LinkedList<>();
        int maxLwn = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            while (window.contains(ch)) {
                window.removeFirst();
            }

            window.add(ch);
            maxLwn = Math.max(maxLwn, window.size());
        }

        return maxLwn;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = longestSubstring(s);
        System.out.println(result);
    }
}
