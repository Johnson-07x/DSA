package Leetcode.LinkedList;

// to be continued../
// Leetcode no.25
public class ReverseNodesInKgroup {
    static public ListNode reverseKGroup(ListNode head, int k) {

    }

    static void main(String[] args) {
        ListNode l1 = ListNode.fromArray(new int[]{1, 2, 3, 4, 5});
        int k = 2;
        ListNode result = reverseKGroup(l1, k);
        ListNode.print(result);
    }
}
