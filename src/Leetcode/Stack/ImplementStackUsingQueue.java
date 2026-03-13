package Leetcode.Stack;

import java.util.LinkedList;
import java.util.Queue;

// Leetcode no.225
class MyStack {
    Queue<Integer> q1;
    public MyStack() {
        q1 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        for (int i = 0; i < q1.size() - 1; i++) {
            q1.add(q1.remove());
        }
        return q1.remove();
    }

    public int top() {
        int element = pop();
        q1.add(element);
        return element;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}

public class ImplementStackUsingQueue {
    static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(10);
        ms.push(20);
        ms.push(30);
        System.out.println(ms.top());
    }
}
