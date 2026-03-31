package Leetcode;

import java.util.Arrays;

// Leetcode no.2946
public class MatrixSimilarityAfterCyclicShifts {
//    static void rotate(int[] arr, int k) {
//        int n = arr.length;
//        int[] left = new int[n];
//        // Left rotate
//        k = k % n;
//        for (int i = 0; i < n; i++) {
//            // New index for left rotation: (i + (n - k)) % n
//            left[i] = arr[(i + k) % n];
//        }
//
//        // Right rotate
//        int[] right = new int[n];
//        for (int i = 0; i < n; i++) {
//            // New index formula for right rotation
//            right[(i + k) % n] = arr[i];
//        }
//        System.out.println(Arrays.toString(left));
//        System.out.println(Arrays.toString(right));
//    }

    static public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        k %= m;
        int[][] newArr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i & 1) == 0) {
                    newArr[i][j] = mat[i][(j + k) % n];
                } else {
                    newArr[i][j] = mat[i][(j + n - k) % n];
                }
            }
        }

        // check two array contents are same
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (newArr[i][j] != mat[i][j]) return false;
            }
        }

        return true;
    }

    static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 4;
        boolean result = areSimilar(arr, k);
        System.out.println(result);
    }
}
