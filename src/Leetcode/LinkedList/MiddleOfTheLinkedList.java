package Leetcode.LinkedList;

// Leetcode no.876
public class MiddleOfTheLinkedList {
    static public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if (head.next == null) {
            return head;
        }

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next == null) {
            return slow;
        }
        else {
            return slow.next;
        }
    }

    static void main(String[] args) {
        ListNode l1 = ListNode.fromArray(new int[] {1,2,3,4,5});
        ListNode mid = middleNode(l1);
        ListNode.print(mid);
    }
}
