package Leetcode.LinkedList;

// Leetcode no.237
public class DeleteNodeInLinkedList {
    static public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    static void main(String[] args) {
        ListNode l1 = ListNode.fromArray(new int[] {4,5,1,9});
        deleteNode(l1);
        ListNode.print(l1);
    }
}
