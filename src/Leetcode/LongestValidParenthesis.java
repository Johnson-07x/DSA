package Leetcode;

import java.util.Stack;

// Leetcode no.32
// Similar to DP
public class LongestValidParenthesis {
    static public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        // Base for the first valid substring calculation
        stack.push(-1);
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    // If empty, this ')' is a new starting boundary
                    stack.push(i);
                } else {
                    // Current index - index of the last unmatched '('
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        return maxLen;
    }

    static void main(String[] args) {
        String s = "(()";
        int result = longestValidParentheses(s);
        System.out.println(result);
    }
}
