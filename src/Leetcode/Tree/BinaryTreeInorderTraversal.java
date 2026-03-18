package Leetcode.Tree;

import java.util.LinkedList;
import java.util.List;

// Leetcode no.94
public class BinaryTreeInorderTraversal {
    public static void inorderRec(List<Integer> l, TreeNode node) {
        if (node == null) return;
        inorderRec(l, node.left);
        l.add(node.val);
        inorderRec(l, node.right);
    }

    static public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        if (root == null) {
            return l;
        }
        inorderRec(l, root);
        return l;
    }

    static void main(String[] args) {
        TreeNode t = TreeNode.insert(new int[] {1,-1,2,3});
        List<Integer> result = inorderTraversal(t);
        System.out.println(result);
    }
}
