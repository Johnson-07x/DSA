package Leetcode.LinkedList;

// Leetcode no.19
public class RemoveNthNodeFromEndOfList {
    static public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode (0, head);
        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        ListNode temp = dummy;
        for (int i = 0; i < count - n; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return dummy.next;
    }

    static void main(String[] args) {
        ListNode l1 = ListNode.fromArray(new int[] {1,2,3,4,5});
        ListNode result = removeNthFromEnd(l1, 2);
        ListNode.print(result);
    }
}
