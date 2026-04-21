package Leetcode;

import java.util.HashMap;
import java.util.Map;

// Leetcode no.1320
public class MinimumDistanceToTypeAwordUsing2Fingers {
    static public int minimumDistance(String word) {
        char[][] letters = {{'A','B','C','D','E','F'},
                            {'G','H','I','J','K','L'},
                            {'M','N','O','P','Q','R'},
                            {'S','T','U','V','W','X'},
                            {'Y','Z'}};

        Map<Character, int[]> map = new HashMap<>();
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].length; j++) {
                map.put(letters[i][j], new int[] {i, j});
            }
        }
        int[] left = null;
        int[] right = null;
        int cost = 0;
        for (char c : word.toCharArray()) {
            int[] target = map.get(c);

            if (left == null) {
                left = target;
            } else if (right == null) {
                if (target[1] <= left[1]) {
                    int leftMove = (left[0] - target[0]) + (left[1] - target[1]);
                    cost += leftMove;
                    left = target;
                } else {
                    right = target;
                }
            } else {
                int leftMove = Math.abs(left[0] - target[0]) + Math.abs(left[1] - target[1]);
                int rightMove = Math.abs(right[0] - target[0]) + Math.abs(right[1] - target[1]);

                if (leftMove <= rightMove) {
                    cost += leftMove;
                    left = target;
                } else {
                    cost += rightMove;
                    right = target;
                }
            }
        }

        return cost;
    }

    static void main(String[] args) {
        String s = "HAPPY";
        int result = minimumDistance(s);
        System.out.println(result);
    }
}
