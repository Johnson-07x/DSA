package Queue;

import java.util.Scanner;

class MyQueue {
    Object[] arr;
    int front;
    int rear;
    int size;
    MyQueue(int size) {
        this.size = size;
        arr = new Object[size];
        front = 0;
        rear = -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public boolean isEmpty() {
        return rear == front - 1;
    }

    public void add(Object val) {
        if (!isFull()) {
            arr[++rear] = val;
        } else {
            System.out.println("Queue overflow");
        }
    }

    public void remove() {
        if (!isEmpty()) {
            arr[front++] = null;
        } else {
            System.out.println("Queue underflow");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println(arr[front]);
        } else {
            System.out.println("Queue is Empty");
        }
    }

    public boolean offer(int val) {
        if (!isFull()) {
            arr[++rear] = val;
            return true;
        }
        return false;
    }

    public boolean poll() {
        if (!isEmpty()) {
            arr[front++] = null;
            return true;
        }
        return false;
    }
}

public class QueueUsingArrayImpl {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        int size = sc.nextInt();
        MyQueue q = new MyQueue(size);

        q.add(10);
        q.add(20);
        q.add(30);
        q.remove();
        q.remove();
        System.out.println(q.poll());
        q.peek();
    }
}
