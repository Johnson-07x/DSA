package Leetcode;

import java.util.Arrays;

// Leetcode no.73
public class SetMatrixZeroes {
    static public void setZeroes(int[][] matrix) {
        boolean[][] flag = new boolean[matrix.length][matrix[0].length];
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) flag[i][j] = true;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (flag[i][j]) {
                    for (int k = 0; k < row; k++) {
                        matrix[k][j] = 0;
                    }
                    Arrays.fill(matrix[i], 0);
                }
            }
        }
    }

    static void main(String[] args) {
        int[][] matrix = {{1,1,1}, {1,0,3}, {1,1,1}};
        setZeroes(matrix);
    }
}
