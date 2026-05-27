package Leetcode;

// Leetcode no.7
public class ReverseInteger {
    static public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int last = x % 10;
            rev = (rev * 10) + last;
            x /= 10;
        }

        if (rev > 0 && rev < Integer.MAX_VALUE) return (int) rev;
        if (rev < 0 && rev > Integer.MIN_VALUE) return (int) rev;

        return 0;
    }

    static void main(String[] args) {
        int n = -123;
        int result = reverse(n);
        System.out.println(result);
    }
}
