package Leetcode.LinkedList;

// Leetcode no.142
public class LinkedListCycle2 {
    static int cycleLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    length++;
                    if (temp == slow) {
                        return length;
                    }
                } while (temp != slow);
            }
        }
        return length;
    }

    public ListNode detectCycle(ListNode head) {
        int length = cycleLength(head);
        if (length == 0) return null;
        ListNode first = head;
        ListNode second = head;
        while (length > 0) {
            second = second.next;
            length--;
        }
        while (second != first) {
            first = first.next;
            second = second.next;
        }
        return first;
    }
}
