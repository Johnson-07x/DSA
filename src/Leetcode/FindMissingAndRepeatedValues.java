package Leetcode;

import java.util.Arrays;

// Leetcode no.2965
public class FindMissingAndRepeatedValues {
    static public int[] findMissingAndRepeatedValues(int[][] grid) {
        int length = grid.length * 2;
        int[] freq = new int[length + 1];
        for (int[] n : grid) {
            for (int e : n) {
                freq[e]++;
            }
        }

        int a = 0;
        int b = 0;
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 2) a = i;
            if (freq[i] == 0) b = i;
            if (a != 0 && b != 0) break;
        }
        return (new int[] {a, b});
    }

    static void main(String[] args) {
        int[][] arr = {{1,3},{2,2}};
        int result[] = findMissingAndRepeatedValues(arr);
        System.out.println(Arrays.toString(result));
    }
}
