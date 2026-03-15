package Leetcode.LinkedList;

// Leetcode no.707
class MyLinkedList {
    int size = 0;
    Node2 head;
    Node2 tail;

    class Node2 {
        int val;
        Node2 prev;
        Node2 next;
        Node2(int val) { this.val = val; }
        Node2(int val, Node2 next) {
            this.val = val;
            this.next = next;
        }
    }

    public MyLinkedList() {
        size = 0;
        head = tail = null;
    }

    public int get(int index) {
        // Must check bounds to avoid NullPointerException
        if (index < 0 || index >= size) return -1;
        Node2 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node2 newNode = new Node2(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size += 1;
    }

    public void addAtTail(int val) {
        Node2 newNode = new Node2(val);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size += 1;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }

        Node2 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node2 newNode = new Node2(val, temp.next);
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        size += 1;
    }

    public void deleteAtFront() {
        if (size == 0) return;
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size -= 1;
    }

    public void deleteAtLast() {
        if (size == 0) return;
        if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size -= 1;
    }

    public void deleteAtIndex(int index) {
        // Changed index > size to index >= size because index is 0-based
        if (index < 0 || index >= size) return;

        if (index == 0) {
            deleteAtFront();
            return;
        }

        if (index == size - 1) {
            deleteAtLast();
            return;
        }

        Node2 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        // Re-link surrounding nodes
        temp.prev.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        size -= 1;
    }
}