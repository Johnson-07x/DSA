package Leetcode;

// Leetcode no.200
public class NumOfIslands {
    static public void backtrack(char[][] grid, int row, int col) {
        if (row < 0 || row > grid.length || col < 0 || col > grid[0].length || grid[row][col] == '0') return;
        grid[row][col] = '0';
        backtrack(grid, row + 1, col);
        backtrack(grid, row, col + 1);
        backtrack(grid, row - 1, col);
        backtrack(grid, row, col - 1);
    }

    static public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    backtrack(grid, i , j);
                    count++;
                }
            }
        }
        return count;
    }

    static void main(String[] args) {
        char[][] grid = {{'1','1','1','1','0'},
                        {'1','1','0','1','0'},
                        {'1','1','0','0','0'},
                        {'0','0','0','0','0'}};
        int result = numIslands(grid);
        System.out.println(result);
    }
}