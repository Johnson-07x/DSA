package Kunal.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class MazeWithObstacle {
    public static int countPossiblePaths(boolean[][] maze, int r, int c) {
        int row = maze.length;
        int col = maze[0].length;
        if (!maze[r][c]) return 0;
        if (r == row - 1 && c == col - 1) {
            return 1;
        }

        int right = 0;
        int down = 0;
        if (c < col - 1) {
            right = countPossiblePaths(maze, r, c + 1);
        }
        if (r < row - 1) {
            down = countPossiblePaths(maze, r + 1, c);
        }
        return right + down;
    }

    public static void printPath(String result, boolean[][] maze, int r, int c) {
        int row = maze.length;
        int col = maze[0].length;
        if (r == row - 1 && c == col - 1) {
            System.out.println(result);
            return;
        }

        if (!maze[r][c]) return;

        if (c < col - 1) {
            printPath(result + "R", maze, r, c + 1);
        }
        if (r < row - 1) {
            printPath(result + "D", maze, r + 1, c);
        }
    }

    public static List<String> storePossiblePaths(String result,boolean[][] maze, int r, int c) {
        int row = maze.length;
        int col = maze[0].length;
        if (r == row - 1 && c == col - 1) {
            List<String> list = new ArrayList<>();
            list.add(result);
            return list;
        }

        if (!maze[r][c]) return new ArrayList<>();

        List<String> ans = new ArrayList<>();
        if (c < col - 1) {
            ans.addAll(storePossiblePaths(result + "R", maze, r, c + 1));
        }
        if (r < row - 1) {
            ans.addAll(storePossiblePaths(result + "D", maze, r + 1, c));
        }

        return ans;
    }

    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        printPath("", maze, 0, 0);

        System.out.println("Possible Ways: " + countPossiblePaths(maze, 0, 0));

        List<String> result = storePossiblePaths("", maze, 0, 0);
        System.out.println(result);
    }
}
