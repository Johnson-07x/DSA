package Leetcode.Tree;

// Leetcode no.100
public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    static void main(String[] args) {
        TreeNode p = TreeNode.insert(new int[] {1,2,3});
        TreeNode q = TreeNode.insert(new int[] {1,2,3});
        boolean result = isSameTree(p, q);
        System.out.println(result);
    }
}
