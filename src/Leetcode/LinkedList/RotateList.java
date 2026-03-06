package Leetcode.LinkedList;

// Leetcode no.61
public class RotateList {
    static public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode curr = head;
        int length = 1;
        while (curr.next != null) {
            curr = curr.next;
            length++;
        }

        curr.next = head;
        k = k % length;
        int stepsToNewTail = length - k;

        for (int i = 0; i < stepsToNewTail; i++) {
            curr = curr.next;
        }

        head = curr.next;
        curr.next = null;

        return head;
    }

    static void main(String[] args) {
        ListNode l1 = ListNode.fromArray(new int[] {1,2,3,4,5});
        ListNode result = rotateRight(l1, 2);
        ListNode.print(result);
    }
}
