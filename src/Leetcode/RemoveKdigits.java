package Leetcode;

import java.util.Stack;

// Leetcode no.402
class Solution12 {
    public String removeKdigits(String num, int k) {
        if (num.length() <= k) {
            return "0";
        }
        Stack<Character> stack = new Stack<>();
        for (char e : num.toCharArray()) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > e) {
                stack.pop();
                k--;
            }
            stack.push(e);
        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        for (char e : stack) {
            sb.append(e);
        }

        while (sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}

public class RemoveKdigits {
    static void main(String[] args) {
        String s = "1432219";
        int k = 3;
        Solution12 s12 = new Solution12();
        System.out.println(s12.removeKdigits(s, k));
    }
}
