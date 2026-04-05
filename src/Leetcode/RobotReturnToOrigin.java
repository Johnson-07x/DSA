package Leetcode;

import java.util.HashMap;
import java.util.Map;

// Leetcode no.657
public class RobotReturnToOrigin {
    static public boolean judgeCircle(String moves) {
        Map<String, Integer> map = new HashMap<>();
        map.put("R", 1);
        map.put("L", -1);
        map.put("U", 1);
        map.put("D", -1);
        int horizontal = 0;
        int vertical = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'R' || c == 'L') horizontal += map.get(Character.toString(c));
            if (c == 'U' || c == 'D') vertical += map.get(Character.toString(c));
        }

        return horizontal == 0 && vertical == 0;
    }

    static void main(String[] args) {
        String moves = "UDDUURLRLLRRUDUDLLRLURLRLRLUUDLULRULRLDDDUDDDDLRRDDRDRLRLURRLLRUDURULULRDRDLURLUDRRLRLDDLUUULUDUUUUL";
        boolean result = judgeCircle(moves);
        System.out.println(result);
    }
}
