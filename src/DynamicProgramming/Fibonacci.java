package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    // DP Type 1: Recursive
    static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n -1) + fibRecursive(n - 2);
    }

    // DP Type 2: Top Down Approach
    static int fibMemoization(int[] dp, int n) {
        if (n <= 1) return n;
        if (dp[n] != -1) return dp[n];
        return dp[n] = fibMemoization(dp, n - 1) + fibMemoization(dp, n - 2);
    }

    // DP Type 3: Down Top Approach
    static int fibTabulation(int n) {
        if (n <= 1) return n;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr[n];
    }

    // DP Type 4: Space Optimized Approach
    static int fibSpaceOptimization(int n) {
        if (n <= 1) return n;
        int num1 = 0;
        int num2 = 1;
        for (int i = 2; i <= n; i++) {
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        return num2;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Num: ");
        int n = sc.nextInt();
        System.out.println(fibRecursive(n));
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fibMemoization(dp, n));
        System.out.println(fibTabulation(n));
        System.out.println(fibSpaceOptimization(n));
    }
}
