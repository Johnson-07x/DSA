package Leetcode;

// Leetcode no.622
class MyCircularQueue {
    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;
    public MyCircularQueue(int k) {
        capacity = k;
        arr = new int[capacity];
        rear = -1;
        front = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        arr[front] = 0;
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
