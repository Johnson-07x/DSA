package Revision.Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAllElements {
    static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // 1. Dequeue all elements and push them onto the stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // 2. Pop all elements from the stack and enqueue them back
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Original Queue: " + queue);
        reverse(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}
