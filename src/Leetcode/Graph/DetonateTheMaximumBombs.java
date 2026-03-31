package Leetcode.Graph;

import java.util.ArrayList;
import java.util.List;

// Leetcode no.2101
public class DetonateTheMaximumBombs {
    public static int maximumDetonation(int[][] bombs) {
        int n = bombs.length;

        // step 1: create graph (adjacency list)
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // step 2: Build graph using distance formula
        for (int i = 0; i < n; i++) {
            long x1 = bombs[i][0];
            long y1 = bombs[i][1];
            long r1 = bombs[i][2];

            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                long x2 = bombs[j][0];
                long y2 = bombs[j][1];

                long dx = x1 - x2;
                long dy = y1 - y2;
                if (dx * dx + dy * dy <= r1 * r1) {
                    graph.get(i).add(j);
                }
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dfs(i, graph, new boolean[n]));
        }

        return max;
    }

    private static int dfs(int curr, List<List<Integer>> graph, boolean[] visited) {
        visited[curr] = true;
        int count = 1;
        for (int neighbor : graph.get(curr)) {
            if (!visited[neighbor]) {
                count += dfs(neighbor, graph, visited);
            }
        }
        return count;
    }

    static void main(String[] args) {
        int[][] testBombs = {{2,1,3}, {6,1,4}};
        int result = maximumDetonation(testBombs);
        System.out.println(result);
    }
}
