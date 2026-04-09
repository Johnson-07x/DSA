package Leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

// Leetcode no.95
public class UniqueBST2 {
    static public List<TreeNode> buildTree(int start, int end) {
        List<TreeNode> result = new ArrayList<>();

        if (start > end) {
            result.add(null);
            return result;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> leftTree = buildTree(start, i - 1);
            List<TreeNode> rightTree = buildTree(i + 1, end);

            for (TreeNode left : leftTree) {
                for (TreeNode right : rightTree) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
        }

        return result;
    }

    static public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return buildTree(1, n);
    }

    static void main(String[] args) {
        int n = 3;
        List<TreeNode> result = generateTrees(n);
        System.out.println(result);
    }
}
