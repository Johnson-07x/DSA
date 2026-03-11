package Leetcode.LinkedList;

// Leetcode no.24
public class SwapNodesInPairs {
    static public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;

        while (temp.next != null && temp.next.next != null) {
            ListNode first = temp.next;
            ListNode second = temp.next.next;

            first.next = second.next;
            second.next = first;
            temp.next = second;

            temp = first;
        }

        return dummy.next;
    }

    static void main(String[] args) {
        ListNode l1 = ListNode.fromArray(new int[] {1,2,3,4});
        ListNode result = swapPairs(l1);
        ListNode.print(result);
    }
}
