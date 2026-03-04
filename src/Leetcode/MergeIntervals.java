package Leetcode;

import java.util.Arrays;
import java.util.LinkedList;

// Leetcode no.56
public class MergeIntervals {
    static public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        LinkedList<int[]> merged = new LinkedList<>();

        for (int[] interval : intervals) {
            if (merged.isEmpty() || interval[0] > merged.getLast()[1]) {
                merged.add(interval);
            } else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }


    static void main(String[] args) {
        int[][] arr = {{8,10},{15,18},{1,3},{2,6}};
        int[][] result = merge(arr);
        System.out.println(Arrays.deepToString(result));
    }
}
