package Leetcode;

import java.util.Stack;

// Leetcode no.682
public class BaseBallGame {
    static public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for (String e : operations) {
            if (e.equals("C") && !s.isEmpty()) {
                s.pop();
            } else if (e.equals("D") && !s.isEmpty()) {
                s.push(s.peek() * 2);
            } else if (e.equals("+")) {
                int first = s.pop();
                int second = s.peek();
                s.push(first);
                s.push(first + second);
            } else {
                s.push(Integer.valueOf(e));
            }
        }

        int result = 0;
        for (int e : s) {
            result += e;
        }

        return result;
    }

    static void main(String[] args) {
        String[] arr = {"5","2","C","D","+"};
        int result = calPoints(arr);
        System.out.println(result);
    }
}
