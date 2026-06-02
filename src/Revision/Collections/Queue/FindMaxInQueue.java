package Revision.Collections.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FindMaxInQueue {
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1,27,3,76,1,4,5,34,65));

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < q.size(); i++) {
            int current = q.poll();
            if (current > max) max = current;
            q.offer(current);
        }

        System.out.println(max);
        System.out.println(q);
    }
}
