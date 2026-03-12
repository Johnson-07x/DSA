package Leetcode;

import java.util.Stack;

// Leetcode no.1544
public class MakeTheGreatString {
    static public String makeGoodUsingASCII(String s) {
        Stack<Character> stack = new Stack<>();
        for (char e : s.toCharArray()) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - e) == 32) {
                stack.pop();
            } else {
                stack.push(e);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char e : stack) {
            sb.append(e);
        }
        return sb.toString();
    }

    static void main(String[] args) {
        String s = "Pp";
        String result = makeGoodUsingASCII(s);
        System.out.println(result);
    }
}
