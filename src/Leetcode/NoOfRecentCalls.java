package Leetcode;


import java.util.LinkedList;
import java.util.Queue;

// Leetcode no.33
class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q = new LinkedList<>();
    }

    public int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000) {
            q.poll();
        }
        return q.size();
    }
}

public class NoOfRecentCalls {
    static void main(String[] args) {
        RecentCounter rc = new RecentCounter();
        int one = rc.ping(1);
        int two = rc.ping(100);
        int three = rc.ping(30001);
        int four = rc.ping(30002);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
    }
}
