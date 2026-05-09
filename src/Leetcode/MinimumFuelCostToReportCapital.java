package Leetcode;

import java.util.*;

// Leetcode no.2477
public class MinimumFuelCostToReportCapital {
    // FIX: Declare the global fuel counter at the class level
    private long totalFuel = 0;

    public long minimumFuelCost(int[][] roads, int seats) {
        // FIX: Reset the global counter for every new test case execution
        totalFuel = 0;

        int n = roads.length + 1;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Build the adjacency list for the tree
        for (int[] road : roads) {
            adj.get(road[0]).add(road[1]);
            adj.get(road[1]).add(road[0]);
        }

        // Start DFS from the capital (city 0) with a dummy parent (-1)
        dfs(0, -1, adj, seats);

        return totalFuel;
    }

    private long dfs(int node, int parent, List<List<Integer>> adj, int seats) {
        long representatives = 1; // Count the representative of the current city

        for (int neighbor : adj.get(node)) {
            if (neighbor != parent) {
                // Recursively gather representatives from subtrees
                representatives += dfs(neighbor, node, adj, seats);
            }
        }

        // Capital city (0) does not need to send its people further up
        if (node != 0) {
            // Calculate cars needed: ceil(representatives / seats)
            // Fuel added = cars needed * 1 liter per road hop
            totalFuel += (representatives + seats - 1) / seats;
        }

        return representatives;
    }
}

