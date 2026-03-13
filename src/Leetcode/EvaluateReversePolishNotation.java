package Leetcode;

import java.util.Stack;

// Leetcode no.150
public class EvaluateReversePolishNotation {
    static public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for (String e : tokens) {
            if (e.equals("+")) {
                int second = s.pop();
                int first = s.pop();
                s.push(first + second);
            } else if (e.equals("-")) {
                int second = s.pop();
                int first = s.pop();
                s.push(first - second);
            } else if (e.equals("*")) {
                int second = s.pop();
                int first = s.pop();
                s.push(first * second);
            } else if (e.equals("/")) {
                int second = s.pop();
                int first = s.pop();
                s.push(first / second);
            } else {
                s.push(Integer.parseInt(e));
            }
        }

        return s.pop();
    }

    static void main(String[] args) {
        String[] token = {"4","13","5","/","+"};
        int result = evalRPN(token);
        System.out.println(result);
    }
}
