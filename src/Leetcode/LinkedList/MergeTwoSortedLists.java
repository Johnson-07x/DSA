package Leetcode.LinkedList;

public class MergeTwoSortedLists {
    static public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode(0);
        ListNode current = node;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                ListNode n = new ListNode(list1.val);
                current.next = n;
                list1 = list1.next;
            } else {
                ListNode n = new ListNode(list2.val);
                current.next = n;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }
        return node.next;
    }

    static void main(String[] args) {
        ListNode l1 = ListNode.fromArray(new int[]{1, 2, 4});
        ListNode l2 = ListNode.fromArray(new int[]{1, 3, 4});

        System.out.print("List 1: "); ListNode.print(l1);
        System.out.print("List 2: "); ListNode.print(l2);

        ListNode result = mergeTwoLists(l1, l2);

        System.out.print("Merged: ");
        ListNode.print(result);
    }
}
