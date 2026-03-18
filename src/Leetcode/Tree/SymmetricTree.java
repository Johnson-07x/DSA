package Leetcode.Tree;

// Leetcode no.101
public class SymmetricTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
    }

    public static boolean isSymmetric(TreeNode root) {
        TreeNode p = root.left;
        TreeNode q = root.right;
        return isSameTree(p,q);
    }

    static void main(String[] args) {
        TreeNode t = TreeNode.insert(new int[] {1,2,2,3,4,4,3});
        boolean result = isSymmetric(t);
        System.out.println(result);
    }
}
