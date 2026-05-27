package Leetcode;

// Leetcode no.9
public class PalindromeNumber {
    static public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int rev = 0;
        int copy = x;

        while (x != 0) {
            int lastNum = x % 10;
            rev = rev * 10 + lastNum;
            x /= 10;
        }

        return rev == copy;
    }

    static void main(String[] args) {
        int x = -121;
        boolean result = isPalindrome(x);
        System.out.println(result);
    }
}
