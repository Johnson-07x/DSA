package Leetcode.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Leetcode no.2058
public class MinAndMaxNodesBwCriticalPoints {
    static public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> list = new ArrayList<>();
        int idx = 2;
        while (head.next.next != null) {

            if ( ((head.val > head.next.val) && (head.next.val < head.next.next.val)) ||
            ((head.val < head.next.val) && (head.next.val > head.next.next.val)) ){
                list.add(idx);
            }

            idx++;
            head = head.next;
        }

        if (list.size() < 2) return new int[] {-1, -1};

        int min = Integer.MAX_VALUE;
        int max = list.getLast() - list.getFirst();

        for (int i = 1; i < list.size(); i++) {
            min = Math.min(min, list.get(i) - list.get(i - 1));
        }

        return new int[] {min, max};
    }

    public static void main(String[] args) {
        ListNode head = ListNode.fromArray(new int[] {5,3,1,2,5,1,2});
        int[] result = nodesBetweenCriticalPoints(head);
        System.out.println(Arrays.toString(result));
    }
}
