package Leetcode.Tree;

// Leetcode no.450
public class DeleteNodeInBST {
    static public int minValue(TreeNode root) {
        int min = root.val;
        while (root.left != null) {
            min = root.left.val;
            root = root.left;
        }
        return min;
    }

    static public TreeNode deleteRec(TreeNode root, int key) {
        if (root == null) return null;
        if (key < root.val) root.left = deleteRec(root.left, key);
        else if (key > root.val) root.right = deleteRec(root.right, key);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            root.val = minValue(root.right);
            root.right = deleteRec(root.right, root.val);
        }
        return root;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        root = deleteRec(root, key);
        return root;
    }
}
