package Leetcode;

import java.util.ArrayList;
import java.util.List;

// Leetcode no.54
public class SpiralMatrix {
    static public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        if (m == 0) return result;
        boolean[][] visited = new boolean[m][n];
        // R -> D -> L -> U
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int r = 0, c = 0, dir = 0;
        for (int i = 0; i < m * n; i++) {
            result.add(matrix[r][c]);
            visited[r][c] = true;

            int nextR = r + dr[dir];
            int nextC = c + dc[dir];

            if ((nextR >= 0 && nextR < m) && (nextC >= 0 && nextC < n) && !visited[nextR][nextC]) {
                r = nextR;
                c = nextC;
            } else {
                dir = (dir + 1) % 4;
                r += dr[dir];
                c += dc[dir];
            }
        }

        return result;
    }

    static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);
    }
}
