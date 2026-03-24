package Leetcode.Graph;

import java.util.Arrays;

// Leetcode no.733
public class FloodFill {
    static public void backtrack(int[][] image, int sr, int sc, int color, int actual) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != actual || image[sr][sc] == color) return;
        if (image[sr][sc] == actual) image[sr][sc] = color;
        backtrack(image, sr + 1, sc, color, actual);
        backtrack(image, sr, sc + 1, color, actual);
        backtrack(image, sr - 1, sc, color, actual);
        backtrack(image, sr, sc - 1, color, actual);
    }

    static public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        backtrack(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,1,0},{1,0,1}};
        int[][] result = floodFill(arr, 1, 1, 2);
        System.out.println(Arrays.deepToString(result));
    }
}
