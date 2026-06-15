package Kunal.Backtracking;

// Maze that you can go only down and right
public class MazeReachToEndCount {
    public static int count(int r, int c) {
        // Base condition, if the rat reached the botton or the last colm or row there is only one posibility
        if (r == 1 || c == 1) return 1;

        int right = count(r, c - 1);
        int down = count(r - 1, c);

        return right + down;
    }

    public static void main(String[] args) {
        int mazeRow = 3;
        int mazeCol = 3;
        int result = count(mazeRow, mazeCol);
        System.out.println(result);
    }
}
