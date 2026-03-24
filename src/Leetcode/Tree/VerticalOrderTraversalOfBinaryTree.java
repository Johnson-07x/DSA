package Leetcode.Tree;

import java.util.*;

// Leetcode no.987
public class VerticalOrderTraversalOfBinaryTree {
    static class NodeInfo {
        TreeNode node;
        int col, row;
        NodeInfo(TreeNode n, int c, int r) {
            this.node = n;
            this.col = c;
            this.row = r;
        }
    }

    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        // TreeMap to keep columns sorted: <Column, <Row, PriorityQueue<Value>>>
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<NodeInfo> q = new LinkedList<>();
        q.add(new NodeInfo(root, 0, 0));

        while (!q.isEmpty()) {
            NodeInfo curr = q.poll();
            TreeNode node = curr.node;
            int x = curr.col, y = curr.row;

            map.putIfAbsent(x, new TreeMap<>());
            map.get(x).putIfAbsent(y, new PriorityQueue<>());
            map.get(x).get(y).add(node.val);

            if (node.left != null) q.add(new NodeInfo(node.left, x - 1, y + 1));
            if (node.right != null) q.add(new NodeInfo(node.right, x + 1, y + 1));
        }

        List<List<Integer>> result = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> cols : map.values()) {
            List<Integer> columnList = new ArrayList<>();
            for (PriorityQueue<Integer> nodesAtLevel : cols.values()) {
                while (!nodesAtLevel.isEmpty()) {
                    columnList.add(nodesAtLevel.poll());
                }
            }
            result.add(columnList);
        }
        return result;
    }

    static void main(String[] args) {
        TreeNode t = TreeNode.insert(new int[] {1,2,3,4,6,5,7}); // 3,9,20,-1,-1,15,7
        List<List<Integer>> result = verticalTraversal(t);
        System.out.println(result);
    }
}
