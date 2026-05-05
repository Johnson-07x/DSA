package Leetcode.LinkedList;

// Leetcode no.25
public class ReverseNodesInKgroup {
    static public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode curr = head;
        for (int i = 0; i < k; i++) {
            if (curr == null) return head;
            curr = curr.next;
        }

        ListNode prev = null;
        ListNode next = null;

        curr = head;
        for (int i = 0; i < k; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head.next = reverseKGroup(curr, k);

        return prev;
    }

    static void main(String[] args) {
        ListNode l1 = ListNode.fromArray(new int[]{1, 2, 3, 4, 5});
        int k = 2;
        ListNode result = reverseKGroup(l1, k);
        ListNode.print(result);
    }
}
