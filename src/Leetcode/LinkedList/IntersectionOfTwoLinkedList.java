package Leetcode.LinkedList;

// Leetcode no.160
public class IntersectionOfTwoLinkedList {
    static public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int headAcount = 0;
        int headBcount = 0;
        ListNode temp1 = headA;
        while (temp1 != null) {
            headAcount++;
            temp1 = temp1.next;
        }
        ListNode temp2 = headB;
        while (temp2 != null) {
            headBcount++;
            temp2 = temp2.next;
        }
        if (headAcount > headBcount) {
            for (int i = 0; i < headAcount - headBcount; i++) {
                headA = headA.next;
            }
        } else {
            for (int i = 0; i < headBcount - headAcount; i++) {
                headB = headB.next;
            }
        }
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }

    static void main(String[] args) {
        ListNode l1 = ListNode.fromArray(new int[] {4,1,8,4,5});
        ListNode l2 = ListNode.fromArray(new int[] {5,6,1,8,4,5});
        ListNode result = getIntersectionNode(l1, l2);
        ListNode.print(result);
    }
}
