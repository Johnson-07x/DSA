package Revision;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    static public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        // R -> D -> L -> U
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        int m = matrix.length; // column
        int n = matrix[0].length; // row

        boolean[][] visited = new boolean[m][n];

        int row = 0, col = 0, dir = 0;
        for (int i = 0; i < m * n; i++) {
            result.add(matrix[row][col]);
            visited[row][col] = true;

            int nxtRow = row + dx[dir];
            int nxtCol = col + dy[dir];

            if ((nxtRow < m && nxtRow >= 0) && (nxtCol < n && nxtCol >= 0) && !visited[nxtRow][nxtCol]) {
                row = nxtRow;
                col = nxtCol;
            } else {
                dir = (dir + 1) % 4;
                row += dx[dir];
                col += dy[dir];
            }
        }
        return result;
    }

    static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);
    }
}
