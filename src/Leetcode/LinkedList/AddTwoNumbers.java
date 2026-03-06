package Leetcode.LinkedList;

// to be continued../
// Leetcode no.2
public class AddTwoNumbers {
    static public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1Sum = 0;
        int power = 1;
        while (l1 != null) {
            l1Sum += l1.val * power;
            power *= 10;
            l1 = l1.next;
        }
        int l2Sum = 0;
        power = 1;
        while (l2 != null) {
            l2Sum += l2.val * power;
            power *= 10;
            l2 = l2.next;
        }
        System.out.println(l1Sum);
        System.out.println(l2Sum);
        int grandSum = l1Sum + l2Sum;

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while (grandSum > 0) {
            int n = grandSum % 10;
            ListNode newNode = new ListNode(n);
            temp.next = newNode;
            temp = newNode;
            grandSum /= 10;
        }
        if (dummy.next == null) {
            return dummy;
        }
        return dummy.next;
    }

    static void main(String[] args) {
        ListNode l1 = ListNode.fromArray(new int[] {2,4,3});
        ListNode l2 = ListNode.fromArray(new int[] {5,6,4});
        ListNode result = addTwoNumbers(l1, l2);
        ListNode.print(result);
    }
}
