package Leetcode.Tree;

import java.util.LinkedList;
import java.util.List;

// Leetcode no.145
public class BinaryTreePostOrderTraversal {
    public static void postorderRec(List<Integer> l, TreeNode node) {
        if (node == null) return;
        postorderRec(l, node.left);
        postorderRec(l, node.right);
        l.add(node.val);
    }

    static public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        if (root == null) {
            return l;
        }
        postorderRec(l, root);
        return l;
    }

    static void main(String[] args) {
        TreeNode t = TreeNode.insert(new int[] {1,-1,2,3});
        List<Integer> result = postorderTraversal(t);
        System.out.println(result);
    }
}
