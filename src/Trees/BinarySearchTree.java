package Trees;

import java.util.Scanner;

public class BinarySearchTree {
    class Node {
        Node left;
        Node right;
        int data;
        Node(int data) {
            this.data = data;
        }
    }

    Node root;
    void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

    void delete(int key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.data) {
            root.right = deleteRec(root.right, key);
        } else {
            // Node found
            // Case 1 & 2: Leaf or one child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: Two children
            // Get successor (smallest in right subtree)
            root.data = minValue(root.right);
            // Delete the successor
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    private int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    // Inorder recursion -> prints in ascending order
    public void inorder() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        System.out.println("Inorder Traversal: ");
        inorderRecursive(root);
        System.out.println();
    }

    public void inorderRecursive(Node node) {
        if (node == null) return;
        inorderRecursive(node.left);
        System.out.print(node.data + " ");
        inorderRecursive(node.right);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        System.out.print("Enter Tree size: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            bst.insert(val);
        }
        bst.inorder();
        bst.delete(40);
        bst.inorder();
    }
}
