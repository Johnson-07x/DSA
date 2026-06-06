package Leetcode;

// Leetcode no.8
public class StringToInteger {
    static public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int sign = 1;
        long result = 0;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i < n && s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            if (result >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (result <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }

        return (int) (sign * result);
    }

    static void main(String[] args) {
        String s = "   -042";
        int result = myAtoi(s);

        System.out.println(result);
    }
}
