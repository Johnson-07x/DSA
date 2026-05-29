package GFG;

public class SubsetSumProblem {
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;

        for (int num : arr) {
            for (int j = sum; j >= num; j--) {
                if (dp[j - num]) dp[j] = true;
            }
            if (dp[sum]) return true;
        }

        return false;
    }

    static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        boolean result = isSubsetSum(arr, sum);
        System.out.println(result);
    }
}
