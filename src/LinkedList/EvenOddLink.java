package LinkedList;

// to be continued.../
public class EvenOddLink {
    static DoublyListNode evenOddLink(DoublyListNode head) {
        if (head == null) return null;

        // Dummy nodes to act as starting points
        DoublyListNode evenHead = new DoublyListNode(0);
        DoublyListNode oddHead = new DoublyListNode(0);

        DoublyListNode eTail = evenHead;
        DoublyListNode oTail = oddHead;
        DoublyListNode curr = head;

        while (curr != null) {
            if (curr.val % 2 == 0) {
                eTail.next = curr;
                curr.prev = eTail;
                eTail = eTail.next;
            } else {
                oTail.next = curr;
                curr.prev = oTail;
                oTail = oTail.next;
            }
            curr = curr.next;
        }

        // Terminate the odd list to avoid cycles
        oTail.next = null;

        // Connect Even list to Odd list
        if (evenHead.next != null) {
            eTail.next = oddHead.next;
            if (oddHead.next != null) {
                oddHead.next.prev = eTail;
            }
            // Fix the new head (skip dummy)
            DoublyListNode newHead = evenHead.next;
            newHead.prev = null;
            return newHead;
        } else {
            // Only odd numbers exist
            if (oddHead.next != null) oddHead.next.prev = null;
            return oddHead.next;
        }
    }


    static void main(String[] args) {
        DoublyListNode l1 = DoublyListNode.fromArray(new int[] {2,4,2,6,1,4,5,3,2,18});
        DoublyListNode result = evenOddLink(l1);
        DoublyListNode.printForward(result);
    }
}
