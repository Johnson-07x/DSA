package Leetcode.LinkedList;

// Leetcode no.61
public class RotateList {
    static public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int length = 1;
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
            length++;
        }
        curr.next = head;

        k = k % length;
        int stepsToCut = length - k;

        for (int i = 0; i < stepsToCut; i++) {
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
