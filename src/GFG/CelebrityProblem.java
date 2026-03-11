package GFG;

// Solving using Manual Stack implementation
public class CelebrityProblem {
    class Stack {
        int[] arr;
        int top;
        int capacity;
        Stack(int capacity) {
            this.capacity = capacity;
            this.arr = new int[capacity];
            this.top = -1;
        }

        public boolean isFull() {
            return top + 1 == capacity;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public void push(int data) {
            if (isFull()) {
                System.out.println("Stack Overflow.../");
            } else {
                arr[++top] = data;
            }
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow.../");
            } else {
                int e = arr[top];
                top--;
                return e;
            }
            return -1;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack Underflow.../");
            } else {
                return arr[top];
            }
            return -1;
        }

        public int size() {
            return top + 1;
        }
    }

    public int celebrity(int mat[][]) {
        // code here
        Stack s = new Stack(mat.length);
        int length = mat.length;
        for (int i = 0; i < length; i++) {
            s.push(i);
        }
        for (int i = 0; i < length - 1; i++) {
            int n = s.pop();
            int m = s.pop();
            if (mat[n][m] == 1) {
                s.push(m);
            } else {
                s.push(n);
            }
        }

        int celebrity =s.pop();
        for (int i = 0; i < length; i++) {
            if (i == celebrity) continue;
            if ((mat[celebrity][i] != 0 || mat[i][celebrity] != 1)) {
                return  -1;
            }
        }
        return celebrity;
    }

    static void main(String[] args) {
        int[][] mat = {{1,1,1}, {0,1,0}, {1,0,1}};
        CelebrityProblem cp = new CelebrityProblem();
        int result = cp.celebrity(mat);
        System.out.println(result);
    }
}
