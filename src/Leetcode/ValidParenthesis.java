package Leetcode;

import java.util.Stack;

// Leetcode no.20
public class ValidParenthesis {
    static public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') stack.add(c);
            else {
                if (stack.isEmpty()) return false;
                char prev = stack.peek();
                if (c == ')' && prev == '(') stack.pop();
                else if (c == ']' && prev == '[') stack.pop();
                else if (c == '}' && prev == '{') stack.pop();
                else return false;
            }
        }

        return stack.isEmpty();
    }

    static void main(String[] args) {
        String parenthesis = "()[]{}";
        boolean result = isValid(parenthesis);
        System.out.println(result);
    }
}
