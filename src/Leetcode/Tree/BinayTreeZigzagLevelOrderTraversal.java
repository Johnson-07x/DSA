package Leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Leetcode no.103
public class BinayTreeZigzagLevelOrderTraversal {
    static public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;

        while (!q.isEmpty()) {
            int size = q.size();
            LinkedList<Integer> currentLevel = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if (flag) {
                    currentLevel.addLast(node.val);
                } else {
                    currentLevel.addFirst(node.val);
                }

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }

            result.add(currentLevel);
            flag = !flag;
        }
        return result;
    }

    static void main(String[] args) {
        TreeNode t = TreeNode.insert(new int[] {3,9,20,-1,-1,15,7});
        List<List<Integer>> result = zigzagLevelOrder(t);
        System.out.println(result);
    }
}
