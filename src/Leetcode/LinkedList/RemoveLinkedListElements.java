package Leetcode.LinkedList;

// Leetcode no.203
public class RemoveLinkedListElements {
    static public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while (head != null) {
            if (!(head.val == val)) {
                temp.next = new ListNode(head.val);
                temp = temp.next;
            }
            head = head.next;
        }

        return dummy.next;
    }

    static void main(String[] args) {
        ListNode l1 = ListNode.fromArray(new int[] {1,2,6,3,4,5,6});
        int val = 6;
        ListNode result = removeElements(l1, val);
        ListNode.print(result);
    }
}
