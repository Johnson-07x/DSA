package Revision.Collections.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKelementsOfQueue {
    static void reverseKelements(Queue<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < k; i++) {
            s.push(q.poll());
        }

        while (!s.isEmpty()) {
            q.offer(s.pop());
        }

        int remainingElements = q.size() - k;
        for (int i = 0; i < remainingElements; i++) {
            q.offer(q.poll());
        }

        System.out.println(q);
    }

    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
        int k = 3;
        reverseKelements(q, k);
    }
}
