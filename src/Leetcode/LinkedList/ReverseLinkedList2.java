package Leetcode.LinkedList;

// Leetcode no.92
public class ReverseLinkedList2 {
    static public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;
        ListNode revPrev = null;
        ListNode next = null;
        for (int i = left; i <= right; i++) {
            next = curr.next;
            curr.next = revPrev;
            revPrev = curr;
            curr = next;
        }

        prev.next.next = curr;
        prev.next = revPrev;

        return dummy.next;
    }

    static void main(String[] args) {

    }
}
