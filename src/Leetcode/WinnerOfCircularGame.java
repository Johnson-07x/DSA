package Leetcode;

public class WinnerOfCircularGame {
    static public int findTheWinner(int n, int k) {
        int result = winner(n, k);
        return result + 1;
    }

    static int winner(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (winner(n - 1, k) + k) % n;
    }

    static void main(String[] args) {
        int n = 5;
        int k =2;
        System.out.println(findTheWinner(n, k));
    }
}
