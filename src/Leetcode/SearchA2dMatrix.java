package Leetcode;

// Leetcode no.74
public class SearchA2dMatrix {
    static public boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            if ((matrix[i][matrix[i].length - 1] >= target)) {
                for (int n : matrix[i]) {
                    if (n == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 7},{10, 11, 16, 20},{23, 30, 34, 60}};
        int target = 3;
        boolean result = searchMatrix(arr, target);
        System.out.println(result);
    }
}
