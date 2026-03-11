package Leetcode.Stack;

import java.util.Stack;

class MinStack {
    Stack<Integer> s;
    Stack<Integer> m;
    public MinStack() {
        this.s = new Stack<>();
        this.m = new Stack<>();
    }

    public void push(int val) {
        s.push(val);
        if (m.isEmpty() || val <= m.peek()) {
            m.push(val);
        }
    }

    public void pop() {
        if (!s.isEmpty()) {
            if (s.peek().equals(m.peek())) m.pop();
            s.pop();
        }
    }

    public int top() {
        if (!s.isEmpty()) {
            return s.peek();
        }
        return -1;
    }

    public int getMin() {
        if (!m.isEmpty()) {
            return m.peek();
        }
        return -1;
    }
}

public class FindMinInStack {
    static void main(String[] args) {
        MinStack ms = new MinStack();
    }
}
