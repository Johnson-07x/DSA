package Leetcode.Tree;

import Leetcode.LinkedList.ListNode;

// Leetcode no.109
public class ConvertSortedListToBinarySearchTree {
    static public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);

        ListNode mid = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            mid = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        mid.next = null;

        TreeNode root = new TreeNode(slow.val);

        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);

        return root;
    }

    static void main(String[] args) {
        ListNode t = ListNode.fromArray(new int[] {-10,-3,0,5,9});
        TreeNode result = sortedListToBST(t);
        TreeNode.levelOrder(result);
    }
}
