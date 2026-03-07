package Leetcode.LinkedList;

// Leetcode no.206
public class ReverseLinkedList {
    static public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    static void main(String[] args) {
        ListNode l1 = ListNode.fromArray(new int[] {1,2,3,4,5});
        ListNode result = reverseList(l1);
        ListNode.print(result);
    }
}
