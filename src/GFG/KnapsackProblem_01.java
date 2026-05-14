package GFG;

public class KnapsackProblem_01 {
    static public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = wt.length;
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (wt[i - 1] <= j) {
                    int rem = j - wt[i - 1];
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][rem], dp[i - 1][j]);
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n][W];
    }

    static void main(String[] args) {
        int W = 5;
        int[] val = {10, 40, 30, 50};
        int[] wt = {5, 4, 2, 3};
        int result = knapsack(W, val, wt);
        System.out.println(result);
    }
}
