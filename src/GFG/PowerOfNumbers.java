package GFG;

public class PowerOfNumbers {
    static public int calculate(int count, int n) {
        if (count == 0) return n;

        return calculate(count - 1, n * n);
    }

    static public int reverseExponentiation(int n) {
        // code here
        if (n >= 10) return n;
        return calculate(n, n);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = reverseExponentiation(n);
        System.out.println(result);
    }
}
