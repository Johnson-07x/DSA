package Leetcode;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Leetcode no.874
public class WalkingRobotSimulation {
    static public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0, y = 0;
        // Direction -> N, E, W, S
        int[][] moves = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int direction = 0;

        Set<String> obstacleSet = new HashSet<>();
        for (int[] obs : obstacles) {
            obstacleSet.add(obs[0] + "," + obs[1]);
        }

        int max = 0;
        for (int cmd : commands) {
            if (cmd == -1) {
                direction = (direction + 1) % 4;
            } else if (cmd == -2) {
                direction = (direction + 3) % 4;
            } else {
                // move steps
                for (int j = 0; j < cmd; j++) {
                    int newX = x + moves[direction][0];
                    int newY = y + moves[direction][1];

                    if (obstacleSet.contains(newX + "," + newY)) break;

                    x = newX;
                    y = newY;

                    max = Math.max(max, x * x + y * y);
                }
            }
        }
        return max;
    }

    static void main(String[] args) {
        int[] commands = {4,-1,4,-2,4};
        int[][] obstacles = {{2,4}};
        int result = robotSim(commands, obstacles);
        System.out.println(result);
    }
}
