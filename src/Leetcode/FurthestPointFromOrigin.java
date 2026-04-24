package Leetcode;

// Leetcode no.2833
public class FurthestPointFromOrigin {
    static public int furthestDistanceFromOrigin(String moves) {
        int left = 0;
        int right = 0;
        int unknown = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'L') left++;
            else if (c == 'R') right++;
            else unknown++;
        }

        return Math.abs(left - right) + unknown;
    }

    static void main(String[] args) {
        String moves = "L_RL__R";
        int result = furthestDistanceFromOrigin(moves);
        System.out.println(result);
    }
}
