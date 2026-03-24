package Leetcode.Tree;

// Leetcode no.235
public class LowestCommonAncestorOfBinarySearchTree {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curr = root;

        while (curr != null) {
            // Both p and q are in the right subtree
            if (p.val > curr.val && q.val > curr.val) {
                curr = curr.right;
            }
            // Both p and q are in the left subtree
            else if (p.val < curr.val && q.val < curr.val) {
                curr = curr.left;
            }
            // We found the split point (one is left, one is right)
            // or we reached p or q itself.
            else {
                return curr;
            }
        }
        return null;
    }

    static void main(String[] args) {
        TreeNode t = TreeNode.insert(new int[] {6,2,8,0,4,7,9,-1,-1,3,5});
        TreeNode result = lowestCommonAncestor(t, t.left, t.right);
        System.out.println(result.val);
    }
}
