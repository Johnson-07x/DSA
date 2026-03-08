package Leetcode.LinkedList;

// Leetcode no.83
public class RemoveDuplicatesFromSortedList {
    static public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    static void main(String[] args) {
        ListNode l1 = ListNode.fromArray(new int[] {1,1,2,3,3});
        ListNode result = deleteDuplicates(l1);
        ListNode.print(result);
    }
}
