package Leetcode;

// Leetcode no.8
public class StringToInteger {
    static public int myAtoi(String s) {
        long num = 0;
        boolean positive = false;
        boolean negative = false;
        boolean numAdded = false;
        s = s.replace(" ", "");
        System.out.println(s);
        for (char c : s.toCharArray()) {
            if (c == '+') {
                if (numAdded) break;
            }
            if (c == '-') {
                if (numAdded) break;
                negative = true;
                continue;
            }
            if (!Character.isDigit(c)) break;
            if (Character.isDigit(c)) {
                numAdded = true;
                num = (num * 10) + Integer.parseInt(String.valueOf(c));
            }
        }
        if (negative) num = -num;
        return Math.round(num);
    }

    static void main(String[] args) {
        String s = "   0-1";
        int result = myAtoi(s);

        System.out.println(result);
    }
}
