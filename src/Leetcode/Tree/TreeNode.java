package Leetcode.Tree;


import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    static TreeNode root;
    static public TreeNode insert(int[] arr) {
        if (arr.length == 0 || arr[0] == -1) return root;

        Queue<TreeNode> q = new LinkedList<>();
        root = new TreeNode(arr[0]);
        q.add(root);
        int i = 1;
        while (i < arr.length && !q.isEmpty()) {
            TreeNode curr = q.poll();
            if (arr[i] != -1) {
                curr.left = new TreeNode(arr[i]);
                q.add(curr.left);
            }
            i++;

            if (i > arr.length || q.isEmpty()) break;

            if (arr[i] != -1) {
                curr.right = new TreeNode(arr[i]);
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }

    static public void levelOrder() {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            System.out.print(curr.val + " ");
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
        System.out.println();
    }
 }

