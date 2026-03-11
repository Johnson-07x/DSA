package LinkedList;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Operations {
    int size = 0;
    Node head;
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    void insertAtPosition(int index, int data) {
        if (index == 0) {
            insertAtBeginning(data);
            return;
        }
        if (index == size) {
            insertAtEnd(data);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void removeAtBeginning() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    void removeAtEnd() {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public void reverseList() {
        Node curr = head;
        Node prev = null;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}

public class LinkedList {
    static void main(String[] args) {
        Operations op = new Operations();
//        op.insertAtBeginning(10);
//        op.insertAtBeginning(20);
//        op.insertAtBeginning(30);

        op.insertAtEnd(10);
        op.insertAtEnd(20);
        op.insertAtEnd(30);
        op.insertAtBeginning(40);
        op.insertAtEnd(50);
        op.display();
        op.removeAtBeginning();
        op.display();
        op.removeAtEnd();
        op.insertAtPosition(1, 40);
        op.display();

        op.reverseList();
        op.display();
    }
}
