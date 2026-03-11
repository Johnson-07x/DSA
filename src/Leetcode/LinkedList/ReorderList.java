package Leetcode.LinkedList;

public class ReorderList {
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

    static public ListNode reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode first = head;
        ListNode second = reverseList(slow.next);
        slow.next = null;
        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }

        return head;
    }

    static void main(String[] args) {
        ListNode l1 = ListNode.fromArray(new int[] {1,2,3,4});
        ListNode result = reorderList(l1);
        ListNode.print(result);
    }
}
