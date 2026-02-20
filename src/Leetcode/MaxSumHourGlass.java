package Leetcode;

// Leetcode no.2428
class Solution11 {
    public int maxSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (rows < 3 || cols < 3) {
            return 0;
        }

        int maxSum = 0;
        for (int i = 0; i < rows -2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                int sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2] + grid[i + 1][j + 1]
                        + grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2];

                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}

public class MaxSumHourGlass {
    static void main(String[] args) {
        int[][] grid = {{6,2,1,3},{4,2,1,5},{9,2,8,7},{4,1,2,9}};
        Solution11 s11 = new Solution11();
        System.out.println(s11.maxSum(grid));
    }
}
