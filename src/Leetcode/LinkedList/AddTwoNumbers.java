package Leetcode.LinkedList;

// Leetcode no.2
public class AddTwoNumbers {
    static public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10; // Extract the carry (e.g., 12 / 10 = 1)
            current.next = new ListNode(sum % 10); // Store the digit (e.g., 12 % 10 = 2)
            current = current.next;
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
