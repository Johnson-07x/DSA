package Leetcode.LinkedList;

// Leetcode no.1472
class BrowserHistory {
    class Node {
        String url;
        Node next;
        Node prev;
        public Node(String url) {
            this.url = url;
        }
    }

    Node current;
    public BrowserHistory(String homepage) {
        Node newNode = new Node(homepage);
        current = newNode;
    }

    public void visit(String url) {
        Node newNode = new Node(url);
        current.next = newNode;
        newNode.prev = current;
        current = newNode;
    }

    public String back(int steps) {
        while (steps > 0 && current.prev != null) {
            current = current.prev;
            steps--;
        }
        return current.url;
    }

    public String forward(int steps) {
        while (steps > 0 && current.next != null) {
            current = current.next;
            steps--;
        }
        return current.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */