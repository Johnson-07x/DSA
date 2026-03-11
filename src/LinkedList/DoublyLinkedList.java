package LinkedList;

class Node2 {
    int data;
    Node2 prev;
    Node2 next;

    Node2(int data) {
        this.data = data;
    }

    Node2(int data, Node2 next) {
        this.data = data;
        this.next = next;
    }
}

class Operations2 {
    Node2 head;
    Node2 tail;
    int size = 0;

    public void insertAtStart(int data) {
        Node2 newNode = new Node2(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void insertAtEnd(int data) {
        Node2 newNode = new Node2(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertFromArray(int[] arr) {
        if (arr == null || arr.length == 0) return;
        for (int value : arr) {
            insertAtEnd(value);
        }
    }


    public void insertAtPosition(int index, int data) {
        if (index < 0 || index > size) return;
        if (index == 0) {
            insertAtStart(data);
            return;
        }
        if (index == size) {
            insertAtEnd(data);
            return;
        }

        Node2 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node2 newNode = new Node2(data, temp.next);
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        size++;
    }

    public void printFromStart() {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printFromEnd() {
        Node2 temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public int printAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return -1;
        }
        Node2 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void deleteAtFront() {
        if (size == 0) return;
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void deleteAtLast() {
        if (size == 0) return;
        if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return; // Correction: index cannot equal size

        if (index == 0) {
            deleteAtFront();
            return;
        }
        if (index == size - 1) { // Correction: last valid index is size - 1
            deleteAtLast();
            return;
        }

        Node2 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        // Skip the 'temp' node by linking its neighbors
        temp.prev.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = temp.prev; // Correction: point back to temp.prev
        }
        size--;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) { // Added 'public' and corrected signature
        Operations2 op2 = new Operations2();
        op2.insertAtEnd(1);
        op2.insertAtEnd(2);
        op2.insertAtEnd(3);
        op2.insertAtEnd(4);
        op2.insertAtEnd(5);

        System.out.print("Initial: ");
        op2.printFromStart();

        op2.insertAtPosition(3, 6);
        System.out.print("After inserting 6 at index 3: ");
        op2.printFromStart();

        op2.deleteAtIndex(2);
        System.out.print("After deleting index 2: ");
        op2.printFromStart();

        System.out.print("Reversed: ");
        op2.printFromEnd();

        System.out.println("Data at index 3: " + op2.printAtIndex(3));
    }
}
