package Leetcode.Tree;

// Leetcode no.543
public class DiameterOfBinaryTree {
    int maxDiameter = 0;
    public int findHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);

        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        findHeight(root);
        return maxDiameter;
    }

    public static void main(String[] args) {
        TreeNode t = TreeNode.insert(new int[] {1,2,3,4,5});
        int result = new DiameterOfBinaryTree().diameterOfBinaryTree(t);
        System.out.println(result);
    }
}
