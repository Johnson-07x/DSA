package Leetcode.Tree;

// Leetcode no.701
public class InsertIntoBinarySearchTree {
    public static TreeNode insertRec(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left = insertRec(root.left, val);
        else root.right = insertRec(root.right, val);
        return root;
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        root = insertRec(root, val);
        return root;
    }
}
