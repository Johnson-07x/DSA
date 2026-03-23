package Leetcode.Tree;

import java.util.LinkedList;
import java.util.List;

// Leetcode no.230
public class KthSmallestElementInBST {
    public static void store(TreeNode root, List<Integer> l) {
        if (root == null) return;
        store(root.left, l);
        l.add(root.val);
        store(root.right, l);
    }

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> l = new LinkedList<>();
        store(root, l);
        return l.get(k - 1);
    }
}
