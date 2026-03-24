package Trees;

import java.util.*;

public class BinaryTreeTopView {
    static class Pair {
        TreeNode node;
        int hd;
        public Pair(TreeNode node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    public static ArrayList<Integer> topView(TreeNode root) {
        if (root == null) return null;
        Map<Integer, Integer> m = new TreeMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair current = q.poll();
            int hd = current.hd;
            TreeNode node = current.node;

            if (!m.containsKey(hd)) m.put(hd, node.val);

            if (node.left != null) q.add(new Pair(node.left, hd - 1));
            if (node.right != null) q.add(new Pair(node.right, hd + 1));
        }

        for (int e : m.values()) result.add(e);
        return result;
    }

    static void main(String[] args) {
        TreeNode t = TreeNode.insert(new int[] {10, 20, 30, 40, 60, 90, 100});
        ArrayList<Integer> result = topView(t);
        System.out.println(result);
    }
}
