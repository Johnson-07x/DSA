package Leetcode.LinkedList;

// Leetcode no.86
public class PartitionList {
    static public ListNode partition(ListNode head, int x) {
        ListNode lesser = new ListNode(0);
        ListNode result = lesser;
        ListNode greater = new ListNode(0);
        ListNode greaterCopy = greater;
        while (head != null) {
            if (head.val < x) {
                lesser.next = new ListNode(head.val);
                lesser = lesser.next;
            } else {
                greater.next = new ListNode(head.val);
                greater = greater.next;
            }
            head = head.next;
        }
        lesser.next = greaterCopy.next;

        return result.next;
    }

    static void main(String[] args) {
        ListNode l1 = ListNode.fromArray(new int[] {1,4,3,2,5,2});
        int x = 3;
        ListNode result = partition(l1, x);
        ListNode.print(result);
    }
}
