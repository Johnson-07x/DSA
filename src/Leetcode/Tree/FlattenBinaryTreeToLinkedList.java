package Leetcode.Tree;

// Leetcode no.114
public class FlattenBinaryTreeToLinkedList {
    static TreeNode prev = null;
    static public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }

    static void main(String[] args) {
        TreeNode t = TreeNode.insert(new int[] {1,2,5,3,4,-1,6});
        flatten(t);
        TreeNode.levelOrder(t);
    }
}
