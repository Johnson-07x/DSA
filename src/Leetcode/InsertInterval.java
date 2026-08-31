package Leetcode;

import java.util.*;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> allIntervals = new ArrayList<>(Arrays.asList(intervals));
        allIntervals.add(newInterval);
        allIntervals.sort((a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        for (int[] interval : allIntervals) {
            if (result.isEmpty() || result.getLast()[1] < interval[0]) {
                result.add(interval);
            } else {
                result.getLast()[1] = Math.max(result.getLast()[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        int[][] result = insert(intervals, newInterval);
        System.out.println(Arrays.deepToString(result));
    }
}
