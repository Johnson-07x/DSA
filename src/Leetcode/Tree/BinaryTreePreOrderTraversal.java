package Leetcode.Tree;

import java.util.LinkedList;
import java.util.List;

// Leetcode no.144
public class BinaryTreePreOrderTraversal {
    public static void preorderRec(List<Integer> l, TreeNode node) {
        if (node == null) return;
        l.add(node.val);
        preorderRec(l, node.left);
        preorderRec(l, node.right);
    }

    static public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        if (root == null) {
            return l;
        }
        preorderRec(l, root);
        return l;
    }

    static void main(String[] args) {
        TreeNode t = TreeNode.insert(new int[] {1,-1,2,3});
        List<Integer> result = preorderTraversal(t);
        System.out.println(result);
    }
}
