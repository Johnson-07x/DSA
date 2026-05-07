package Leetcode.Stack;

import java.util.Stack;

// Leetcode no.232
public class ImplementQueueUsingStacks {
    Stack<Integer> in;
    Stack<Integer> out;
    public ImplementQueueUsingStacks() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        peek();
        return out.pop();
    }

    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) out.push(in.pop());
        }
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}
