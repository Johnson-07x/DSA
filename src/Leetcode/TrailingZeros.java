package Leetcode;

public class TrailingZeros {
    public static int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 13;
        int result = trailingZeroes(n);
        System.out.println(result);
    }
}
