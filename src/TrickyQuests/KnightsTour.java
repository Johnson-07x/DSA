package TrickyQuests;

import java.util.Scanner;

public class KnightsTour {
    static int[] x = {2,1,-1,-2,-2,-1,1,2};
    static int[] y = {1,2,2,1,-1,-2,2,-1};

    static boolean tour (int[][] board, int row, int col, int count, int n) {
        if (count == n * n + 1) {
            return true;
        }
        for (int i = 0; i < 8; i++) {
            int x1 = row + x[i];
            int y1 = col + y[i];
            if (x1 >= 0 && y1 >= 0 && x1 < n && y1 < n && board[x1][y1] == 0) {
                board[x1][y1] = count;
                if (tour(board, x1, y1, count + 1, n)) {
                    return true;
                }
                board[x1][y1] = 0;
            }
        }

        return false;
    }

    static void print(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.printf("%3d ", board[i][j]);
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        board[0][0] = 1;
        if (tour(board, 0, 0, 2, n)) {
            print(board);
            return;
        }
        System.out.println("Not Possible");
    }
}
