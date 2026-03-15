package Leetcode.LinkedList;

// Leetcode no.23
public class MergeKsortedLists {
    static public ListNode sort(ListNode l1, ListNode l2) {
        ListNode curr = new ListNode(0);
        ListNode temp = curr;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                ListNode n = new ListNode(l1.val);
                temp.next = n;
                l1 = l1.next;
            } else {
                ListNode n = new ListNode(l2.val);
                temp.next = n;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if (l1 != null) temp.next = l1;
        if (l2 != null) temp.next = l2;

        return curr.next;
    }

    static public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode result = lists[0];
        for (int i = 1; i < lists.length; i++) {
            result = sort(result, lists[i]);
        }
        return result;
    }

    static void main(String[] args) {
        ListNode[] lists = {
                ListNode.fromArray(new int[]{1,4,5}),
                ListNode.fromArray(new int[]{1,3,4}),
                ListNode.fromArray(new int[]{2,6})
        };

        ListNode result = mergeKLists(lists);
        ListNode.print(result);
    }
}
