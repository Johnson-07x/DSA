package LinkedList;

public class EvenOddLink {
    static DoublyListNode evenOddLink(DoublyListNode head) {
        DoublyListNode curr = head;
        DoublyListNode oddHead = new DoublyListNode(0);
        DoublyListNode evenHead = new DoublyListNode(0);
        DoublyListNode oTail = oddHead;
        DoublyListNode eTail = evenHead;
        while (curr != null) {
            if (curr.val % 2 == 0) {
                DoublyListNode n = new DoublyListNode(curr.val);
                eTail.next = n;
                n.prev = eTail;
                eTail = n;
            } else {
                DoublyListNode n = new DoublyListNode(curr.val);
                oTail.next = n;
                n.prev = oTail;
                oTail = n;
            }
            curr = curr.next;
        }
        eTail.next = oddHead.next;
        return evenHead.next;
    }

    static void main(String[] args) {
        DoublyListNode l1 = DoublyListNode.fromArray(new int[] {1,2,3,4,5,6,7,8,9,10});
        DoublyListNode result = evenOddLink(l1);
        DoublyListNode.printForward(result);
    }
}
