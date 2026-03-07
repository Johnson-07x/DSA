package Leetcode.LinkedList;

// Leetcode no.141
// Floyd cycle algorithm
public class LinkedCycleList {
    static public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    static void main(String[] args) {
        ListNode l1 = ListNode.fromArray(new int[] {3,2,0,-4});
        boolean result = hasCycle(l1);
        System.out.println(result);
    }
}
