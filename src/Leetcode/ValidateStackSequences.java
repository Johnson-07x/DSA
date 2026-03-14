package Leetcode;

import java.util.Stack;

// Leetcode no.946
public class ValidateStackSequences {
    static public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();
        int index = 0;
        for (int i = 0; i < pushed.length; i++) {
            s.push(pushed[i]);
            while (!s.isEmpty() && s.peek() == popped[index]) {
                index++;
                s.pop();
            }
        }
        while (!s.isEmpty() && s.peek() == popped[index]) {
            index++;
            s.pop();
        }
        return s.isEmpty();
    }

    static void main(String[] args) {
        int[] pushed = {2,1,0};
        int[] popped = {1,2,0};
        boolean result = validateStackSequences(pushed, popped);
        System.out.println(result);
    }
}
