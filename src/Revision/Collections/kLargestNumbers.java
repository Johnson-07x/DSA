package Revision.Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class kLargestNumbers {
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 50};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Set<Integer> s = new HashSet<>(); // we are using set to reduce the look up time to O(log n)

        for (Integer e : arr) {
            if (!s.contains(e)) {
                s.add(e);
                pq.offer(e);
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.println(pq.poll());
        }
    }
}
