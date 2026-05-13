package Leetcode;

import java.util.ArrayList;
import java.util.List;

// Leetcode no.51
public class Nqueens {
    static public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];

        // Fill the board with empty spaces
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        backtrack(0, board, solutions, n);
        return solutions;
    }

    static private void backtrack(int r, char[][] board, List<List<String>> solutions, int n) {
        // Base Case: If all rows are filled, save the answer
        if (r == n) {
            solutions.add(build(board));
            return;
        }

        for (int c = 0; c < n; c++) {
            // Only place queen if the spot is safe
            if (isSafe(r, c, board, n)) {
                board[r][c] = 'Q';       // Place Queen
                backtrack(r + 1, board, solutions, n); // Move to next row
                board[r][c] = '.';       // Undo (Backtrack)
            }
        }
    }

    // Simple visual safety check function
    static private boolean isSafe(int r, int c, char[][] board, int n) {
        // 1. Check straight up (same column)
        for (int i = 0; i < r; i++) {
            if (board[i][c] == 'Q') return false;
        }

        // 2. Check diagonal up-left
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // 3. Check diagonal up-right
        for (int i = r - 1, j = c + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    // Helper to format the final output
    static private List<String> build(char[][] board) {
        List<String> currentPath = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            currentPath.add(new String(board[i]));
        }
        return currentPath;
    }

    static void main(String[] args) {
        int n = 4;
        List<List<String>> result = solveNQueens(n);
        System.out.println(result);
    }
}
