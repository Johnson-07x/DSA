package Kunal.Backtracking;

public class MazeTravelAllSides {
    public static void printAllDirs(String result, boolean[][] maze, int r, int c) {
        int row = maze.length;
        int col = maze[0].length;
        if (r == row - 1 && c == col - 1) {
            System.out.println(result);
            return;
        }

        if (!maze[r][c]) return;;

        maze[r][c] = false;

        if (r < row - 1) {
            printAllDirs(result + "D", maze, r + 1, c);
        }
        if (c < col - 1) {
            printAllDirs(result + "R", maze, r, c + 1);
        }
        if (r > 0) {
            printAllDirs(result + "U", maze, r - 1, c);
        }
        if (c > 0) {
            printAllDirs(result + "L", maze, r, c - 1);
        }

        maze[r][c] = true;
    }

    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        printAllDirs("", maze, 0, 0);
    }
}
