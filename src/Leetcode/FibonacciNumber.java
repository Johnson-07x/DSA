package Leetcode;

// Leetcode no.509
public class FibonacciNumber {
    static public int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    static void main(String[] args) {
        int n = 4;
        int result = fib(n);
        System.out.println(result);
    }
}
