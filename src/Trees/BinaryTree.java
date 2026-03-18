package Trees;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
    }
}

// Classical BinaryTree Implementation
public class BinaryTree {
    Node root;
    // Method for Inserting Elements from String
    public void insert(String s) {
        if (s.isEmpty()) return;
        String[] values = s.split(" ");
        if (values[0].equals("-1")) return;

        Queue<Node> q = new LinkedList<>();
        root = new Node(Integer.parseInt(values[0]));
        q.add(root);
        int i = 1;
        while (i < values.length && !q.isEmpty()) {
            Node curr = q.poll();
            if (!values[i].equals("-1")) {
                curr.left = new Node(Integer.parseInt(values[i]));
                q.add(curr.left);
            }
            i++;

            if (i > values.length || q.isEmpty()) break;

            if (!values[i].equals("-1")) {
                curr.right = new Node(Integer.parseInt(values[i]));
                q.add(curr.right);
            }
            i++;
        }
    }

    // Method for displaying in Inorder
    public void inorder() {
        if (root == null) {
            System.out.println("Tree is Empty");
            return;
        }
        System.out.print("Inorder Traversal: ");
        inordeRecursive(root);
        System.out.println();
    }
    public void inordeRecursive(Node node) {
        if (node == null) return;
        inordeRecursive(node.left);
        System.out.print(node.data + " ");
        inordeRecursive(node.right);
    }

    // Method for displaying in Preorder
    public void preorder() {
        if (root == null) {
            System.out.println("Tree is Empty");
            return;
        }
        System.out.print("PreOrder Traversal: ");
        preorderRecursive(root);
        System.out.println();
    }
    public void preorderRecursive(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorderRecursive(node.left);
        preorderRecursive(node.right);
    }

    // Method for displaying in Postorder
    public void postorder() {
        if (root == null) {
            System.out.println("Tree is Empty");
            return;
        }
        System.out.print("PostOrder Traversal: ");
        postorderRecursive(root);
        System.out.println();
    }
    public void postorderRecursive(Node node) {
        if (node == null) return;
        postorderRecursive(node.left);
        postorderRecursive(node.right);
        System.out.print(node.data + " ");
    }

    //Method for displaying in LevelOrder
    public void levelOrder() {
        if (root == null) {
            System.out.println("Tree is Empty");
            return;
        }
        System.out.print("LevelOrder Traversal: ");
        Node curr = root;
        Queue<Node> q = new LinkedList<>();
        q.add(curr);
        while (!q.isEmpty()) {
            curr = q.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
        System.out.println();
    }
}
