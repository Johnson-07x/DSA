package Leetcode.Tree;

// Leetcode no.98
public class ValidateBinarySearchTree {
    public static boolean check(TreeNode node, int min, int max) {
        if (node == null) return true;
        if (min > node.val || max < node.val) return false;
        return check(node.left, min, node.val) && check(node.right, node.val, max);
    }

    public static boolean isValidBST(TreeNode root) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        boolean result = check(root, min, max);
        return result;
    }
}
