package Leetcode;

// Leetcode no.44
public class WildcardMatching {
    static public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        // dp[i][j] represents if s[0...i-1] matches p[0...j-1]
        boolean[][] dp = new boolean[m + 1][n + 1];

        // Base case: Empty string matches empty pattern
        dp[0][0] = true;

        // Base case: Empty string matches pattern with only '*'
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        // Build the grid step-by-step
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                // Rule 1: Characters match or '?' is used
                if (p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // Rule 2: '*' can mean empty sequence OR match 1+ characters
                else if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                }
            }
        }

        // The bottom-right cell holds the answer for the entire string and pattern
        return dp[m][n];
    }

    static void main(String[] args) {
        String s = "acdcb";
        String p = "a*c?b";
        boolean result = isMatch(s, p);
        System.out.println(result);
    }
}
