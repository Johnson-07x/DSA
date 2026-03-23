package Leetcode.Tree;

// Leetcode no.129
public class SumRootToLeafNumbers {
    static public int calculate(TreeNode root, int sum) {
        if (root == null) return 0;
        int currentSum = sum * 10 + root.val;
        if (root.left == null && root.right == null) return currentSum;
        return (calculate(root.left, currentSum)) + (calculate(root.right, currentSum));
    }

    static public int sumNumbers(TreeNode root) {
        int result = sumNumbers(root);
        return result;
    }
}
