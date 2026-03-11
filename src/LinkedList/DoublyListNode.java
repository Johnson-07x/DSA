package LinkedList;

class DoublyListNode {
    public int val;
    public DoublyListNode next;
    public DoublyListNode prev;

    // Standard Constructors
    public DoublyListNode() {}
    public DoublyListNode(int val) { this.val = val; }
    public DoublyListNode(int val, DoublyListNode next, DoublyListNode prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }

    /**
     * Helper: Create a Doubly Linked List from an array.
     */
    public static DoublyListNode fromArray(int[] nums) {
        if (nums == null || nums.length == 0) return null;

        DoublyListNode head = new DoublyListNode(nums[0]);
        DoublyListNode curr = head;

        for (int i = 1; i < nums.length; i++) {
            DoublyListNode newNode = new DoublyListNode(nums[i]);
            curr.next = newNode;
            newNode.prev = curr;
            curr = newNode;
        }
        return head;
    }

    /**
     * Helper: Insert at a specific index. Returns the (potentially new) head.
     */
    public static DoublyListNode insertAtIndex(DoublyListNode head, int index, int val) {
        DoublyListNode newNode = new DoublyListNode(val);
        if (index <= 0) {
            if (head != null) {
                newNode.next = head;
                head.prev = newNode;
            }
            return newNode;
        }

        DoublyListNode curr = head;
        for (int i = 0; i < index - 1 && curr.next != null; i++) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        newNode.prev = curr;
        if (curr.next != null) curr.next.prev = newNode;
        curr.next = newNode;

        return head;
    }

    /**
     * Helper: Delete at a specific index. Returns the new head.
     */
    public static DoublyListNode deleteAtIndex(DoublyListNode head, int index) {
        if (head == null) return null;
        if (index == 0) {
            DoublyListNode newHead = head.next;
            if (newHead != null) newHead.prev = null;
            return newHead;
        }

        DoublyListNode curr = head;
        for (int i = 0; i < index && curr != null; i++) {
            curr = curr.next;
        }

        if (curr != null) {
            if (curr.prev != null) curr.prev.next = curr.next;
            if (curr.next != null) curr.next.prev = curr.prev;
        }
        return head;
    }

    /**
     * Helper: Print the list forward.
     */
    public static void printForward(DoublyListNode head) {
        DoublyListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + (curr.next != null ? " <-> " : " <-> null\n"));
            curr = curr.next;
        }
    }

    /**
     * Helper: Print the list backward.
     */
    public static void printBackward(DoublyListNode head) {
        if (head == null) return;
        DoublyListNode curr = head;
        while (curr.next != null) curr = curr.next; // Move to tail

        while (curr != null) {
            System.out.print(curr.val + (curr.prev != null ? " <-> " : " <-> null\n"));
            curr = curr.prev;
        }
    }
}
