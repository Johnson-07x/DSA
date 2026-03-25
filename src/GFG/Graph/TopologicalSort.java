package GFG.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://www.geeksforgeeks.org/problems/topological-sort/1
public class TopologicalSort {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
        }

        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int neighbour : adjList.get(i)) {
                indegree[neighbour]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        while (!q.isEmpty()) {
            int vertex = q.poll();
            result.add(vertex);
            for (int neighbour : adjList.get(vertex)) {
                indegree[neighbour]--;
                if (indegree[neighbour] == 0) q.add(neighbour);
            }
        }

        return result;
    }

    static void main(String[] args) {
        int V = 6;
        int[][] edges = {{1, 3}, {2, 3}, {4, 1}, {4, 0}, {5, 0}, {5, 2}};
        ArrayList<Integer> result = topoSort(V, edges);
        System.out.println(result);
    }
}
