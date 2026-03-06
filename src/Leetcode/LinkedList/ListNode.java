package Leetcode.LinkedList;

public class ListNode {
    public int val;
    public ListNode next;

    // Standard LeetCode constructors
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    /**
     * Helper: Create a linked list from an array for easy testing.
     */
    public static ListNode fromArray(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : nums) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }

    /**
     * Helper: Print the list in a readable format (e.g., 1 -> 2 -> 3).
     */
    public static void print(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + (curr.next != null ? " -> " : ""));
            curr = curr.next;
        }
        System.out.println();
    }
}

