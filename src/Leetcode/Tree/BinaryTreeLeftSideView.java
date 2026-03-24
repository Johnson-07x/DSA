package Leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLeftSideView {
    public static void backtrack(TreeNode root, List<Integer> result, int level) {
        if (root == null) return;
        if (result.size() == level) {
            result.add(root.val);
        }
        backtrack(root.left, result, level + 1);
        backtrack(root.right, result, level + 1);
    }

    static public List<Integer> leftSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        backtrack(root, result, 0);
        return result;
    }

    static void main(String[] args) {
        TreeNode t = TreeNode.insert(new int[] {1,2,3,-1,5,-1,4});
        List<Integer> result = leftSideView(t);
        System.out.println(result);
    }
}
