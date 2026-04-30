package Leetcode;

import java.util.List;

// to be continued../
// Leetcode no.54
public class SpiralMatrix {
    static public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        // R -> D -> L -> U
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[] pos = {0, 0};
        for (int i = 0; i < m * n; i++) {

        }
    }

    static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);
    }
}
