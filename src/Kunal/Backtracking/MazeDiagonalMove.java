package Kunal.Backtracking;

import java.util.ArrayList;
import java.util.List;

// Don't worry in diagonal movement maze we can move diagonally like (3,3) -> (2,2) -> (1,1)
public class MazeDiagonalMove {
    public static void printPossiblePath(String result, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(result);
            return;
        }

        if (r > 1 && c > 1) {
            printPossiblePath(result + "D", r - 1, c - 1);
        }
        if (c > 1) {
            printPossiblePath(result + "H", r, c - 1);
        }
        if (r > 1) {
            printPossiblePath(result + "V", r - 1, c);
        }
    }

    public static List<String> storePossiblePaths(String result, int r, int c) {
        if (r == 1 && c == 1) {
            List<String> list = new ArrayList<>();
            list.add(result);
            return list;
        }

        List<String> ans = new ArrayList<>();
        if (r > 1 && c > 1) {
            ans.addAll(storePossiblePaths(result + "D", r - 1, c - 1));
        }
        if (c > 1) {
            ans.addAll(storePossiblePaths(result + "H", r, c - 1));
        }
        if (r > 1) {
            ans.addAll(storePossiblePaths(result + "V", r - 1, c));
        }

        return ans;
    }

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        printPossiblePath("", rows, cols);

        List<String> result = storePossiblePaths("", rows, cols);
        System.out.println(result);
    }
}
