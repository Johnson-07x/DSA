package Leetcode;

// Leetcode no.1392
public class LongestHappyPrefix {
    static public String longestPrefix(String s) {
        int n = s.length();
        // Base case
        if (n <= 1) return "";

        int[] lps = new int[n];
        int len = 0, i = 1;

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        int longestPrefixLen = lps[n - 1];

        return s.substring(0, longestPrefixLen);
    }

    static void main(String[] args) {
        String s = "level";
        String result = longestPrefix(s);
        System.out.println(result);
    }
}
