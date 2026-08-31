package LeetcodeStreak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Leetcode no.1386
public class CinemaSeatAllocation {
    public static int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int[] seat : reservedSeats) {
            map.putIfAbsent(seat[0], new ArrayList<>());
            map.get(seat[0]).add(seat[1]);
        }

        int expectedRows = 2 * n;

        for (int row : map.keySet()) {
            boolean group1 = true;
            boolean group2 = true;
            boolean group3 = true;
            for (int col : map.get(row)) {
                if (col >= 2 && col <= 5) group1 = false;
                if (col >= 4 && col <= 7) group2 = false;
                if (col >= 6 && col <= 9) group3 = false;
            }

            if (group1 && group3) expectedRows -= 0;
            else if (group1 || group2 || group3) expectedRows -= 1;
            else expectedRows -= 2;
        }
        return expectedRows;
    }

    public static void main(String[] args) {
        int[][] seats = {{4,3},{1,4},{4,6},{1,7}};
        int result = maxNumberOfFamilies(4, seats);
        System.out.println(result);
    }
}
