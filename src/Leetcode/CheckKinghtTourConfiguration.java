package Leetcode;

// Leetcode no.2596
public class CheckKinghtTourConfiguration {
    static public boolean checkValidGrid(int[][] grid) {
        // base case - start from 0,0
        if (grid[0][0] != 0) return false;
        int n = grid.length;

        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
        int r = 0, c = 0;

        for (int step = 1; step < n * n; step++) {
            boolean visited = false;

            for (int i = 0; i < 8; i++) {
                int nr = r + dx[i];
                int nc = c + dy[i];

                if (nr >= 0 && nr < n && nc >= 0 && nc < n && grid[nr][nc] == step) {
                    r = nr;
                    c = nc;

                    visited = true;
                    break;
                }
            }

            if (!visited) return false;
        }

        return true;
    }

    static void main(String[] args) {
        int[][] grid = {{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
        boolean result = checkValidGrid(grid);
        System.out.println(result);
    }
}
