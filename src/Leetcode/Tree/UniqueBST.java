package Leetcode.Tree;

// Leetcode no.96
public class UniqueBST {
    // solving using Catalan numbers
    static public int numTrees(int n) {
        int[] dp = new int[n + 1];

        // By default the 0 and 1 have only 1 possible way
        dp[0] = 1;
        dp[1] = 1;

        // DP approach to find the no.of unique trees
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }

        return dp[n];
    }

    static void main(String[] args) {
        int n = 3;
        int result = numTrees(n);
        System.out.println(result);
    }
}
