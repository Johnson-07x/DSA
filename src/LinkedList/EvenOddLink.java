package LinkedList;

// to be continued.../
public class EvenOddLink {
    static DoublyListNode evenOddLink(DoublyListNode head) {
        DoublyListNode even = null;
        DoublyListNode odd = null;
        DoublyListNode curr = head;
        while (even == null || odd == null) {
            if (even == null && curr.val % 2 == 0) {
                even = curr;
            }
            if (odd == null && curr.val % 2 != 0) {
                odd = curr;
            }
            curr = curr.next;
        }
//        DoublyListNode evenTemp = even.next;
//        while (evenTemp != null) {
//            if (evenTemp.val % 2 == 0) {
//                evenTemp.prev = even;
//                even.next = evenTemp;
//                even = even.next;
//            }
//            evenTemp = evenTemp.next;
//        }
        return odd;
    }

    static void main(String[] args) {
        DoublyListNode l1 = DoublyListNode.fromArray(new int[] {2,4,2,6,1,4,5,3,2});
        DoublyListNode result = evenOddLink(l1);
        DoublyListNode.printForward(result);
    }
}
