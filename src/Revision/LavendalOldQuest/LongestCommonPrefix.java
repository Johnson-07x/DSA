package Revision.LavendalOldQuest;

// Leetcode no.14
public class LongestCommonPrefix {
    static String matchingPrefix(String s1, String s2) {
        int min = Math.min(s1.length(), s2.length());
        String result = "";
        int idx = 1;
        while (idx < min) {
            if (s1.substring(0, idx).equals(s2.substring(0, idx))) {
                if (s1.substring(0, idx).length() > result.length()) {
                    result = s1.substring(0, idx);
                }
            }
            idx++;
        }

        return result;
    }

    static public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String result = "";
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < strs.length - 1; i++) {
            String prefix = matchingPrefix(strs[i], strs[i + 1]);
            min = Math.min(min, prefix.length());
            if (prefix.length() > result.length()) {
                result = prefix;
            }
        }

        return result.substring(0, min);
    }

    static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};
        String result = longestCommonPrefix(arr);
        System.out.println(result);
    }
}
