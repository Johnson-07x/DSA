package Leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Leetcode no.102
public class BinaryTreeLevelOrderTraversal {
    static public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int currentSize = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < currentSize; i++) {
                TreeNode curr = q.poll();
                level.add(curr.val);
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            result.add(level);
        }
        return result;
    }

    static void main(String[] args) {
        TreeNode t1 = TreeNode.insert(new int[] {3,9,20,-1,-1,15,7});
        List<List<Integer>> result = levelOrder(t1);
        System.out.println(result);
    }
}