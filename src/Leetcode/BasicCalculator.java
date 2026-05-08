package Leetcode;

import java.util.Stack;

// Leetcode no,224
public class BasicCalculator {
    static public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int number = 0;
        int result = 0;
        int sign = 1; // 1 for +ve and -1 for -ve

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) number = number * 10 + (c - '0');
            else if (c == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);

                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * number;
                number = 0;

                result *= stack.pop();
                result += stack.pop();
            }
        }

        if (number != 0) result += sign * number;

        return result;
    }

    static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        int result = calculate(s);
        System.out.println(result);
    }
}
