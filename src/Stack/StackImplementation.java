package Stack;

import java.util.Scanner;

class Stack {
    Object[] arr;
    int top;
    int capacity;
    Stack(int capacity) {
        this.capacity = capacity;
        this.arr = new Object[capacity];
        this.top = -1;
    }

    public boolean isFull() {
        return top + 1 == capacity;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Object data) {
        if (isFull()) {
            System.out.println("Stack Overflow.../");
        } else {
            arr[++top] = data;
        }
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow.../");
        } else {
            Object e = arr[top];
            top--;
            return e;
        }
        return null;
    }

    public Object peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow.../");
        } else {
            return arr[top];
        }
        return null;
    }

    public int size() {
        return top + 1;
    }
}

public class StackImplementation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Stack: ");
        int size = sc.nextInt();
        Stack s = new Stack(size);
        s.pop();
        s.peek();
        s.push(10);
        s.push("John");
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        s.push("Rk");
        s.push("Dk");
        s.push("Pk");
    }
}
