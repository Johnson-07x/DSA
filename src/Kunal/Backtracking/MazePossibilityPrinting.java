package Kunal.Backtracking;

import java.util.ArrayList;
import java.util.List;

// Maze that you can go only down and right
public class MazePossibilityPrinting {
    public static void printPossiblePath(String result, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(result);
            return;
        }

        if (c > 1) {
            printPossiblePath(result + "R", r, c - 1);
        }
        if (r > 1) {
            printPossiblePath(result + "D", r - 1, c);
        }
    }

    public static List<String> storePossiblePaths(String result, int r, int c) {
        if (r == 1 && c == 1) {
            List<String> list = new ArrayList<>();
            list.add(result);
            return list;
        }

        List<String> ans = new ArrayList<>();
        if (c > 1) {
            ans.addAll(storePossiblePaths(result + "R", r, c - 1));
        }

        if (r > 1) {
            ans.addAll(storePossiblePaths(result + "R", r - 1, c));
        }

        return ans;
    }

    public static void main(String[] args) {
        int mazeRows = 3;
        int mazeCols = 3;
        printPossiblePath("", mazeRows, mazeCols);

        List<String> result = storePossiblePaths("", mazeRows, mazeCols);
        System.out.println(result);
    }
}
