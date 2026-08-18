package LeetcodeStreak;

import java.util.Arrays;

public class LongestSubstringOfOneRepCharacter {
    static public int calculateLongSubstring(String s) {
        if (s.length() == 1) return 1;
        int count = 1;
        int max = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) count++;
            else count = 1;
            max = Math.max(max, count);
        }

        return max;
    }

    static public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
        int[] result = new int[queryIndices.length];
        for (int i = 0; i < queryIndices.length; i++) {
            StringBuilder sb = new StringBuilder(s);
            sb.setCharAt(queryIndices[i], queryCharacters.charAt(i));
            s = sb.toString();
            result[i] = calculateLongSubstring(s);
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "babacc";
        String queryCharacters = "bcb";
        int[] queryIndices = {1,3,3};
        int[] result = longestRepeating(s, queryCharacters, queryIndices);
        System.out.println(Arrays.toString(result));
    }
}
