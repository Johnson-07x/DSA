package GFG;

public class NthFibonacciNumber {
    static public int nthFibonacci(int n) {
        // code here
        if (n == 0) return 0;
        if (n == 1) return 1;

        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = nthFibonacci(n);
        System.out.println(result);
    }
}
