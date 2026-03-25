package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    ArrayList<ArrayList<Integer>> adjList;
    int v;
    Graph(int v) {
        this.v = v;
        adjList = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
//        adjList.get(dest).add(src);
    }

    // BFS traversal -> exact similar to LevelOrder traversal
    void BFS(int start) {
        boolean[] visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);
        while (!q.isEmpty()) {
            int vertex = q.poll();
            System.out.print(vertex + " ");
            for (int neighbour : adjList.get(vertex)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
    }

    // DFS Traversal
    void DFS(int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int neighbour : adjList.get(start)) {
            if (!visited[neighbour]) {
                DFS(neighbour, visited);
            }
        }
    }

    // Method for finding the shortest Path for Directed and unWeighted graph
    void shortestDistanceBFS (int src) {
        int[] distance = new int[v];
        Arrays.fill(distance, -1);
        distance[src] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);

        while (!q.isEmpty()) {
            int current = q.poll();
            for (int neighbour : adjList.get(current)) {
                if (distance[neighbour] == -1) {
                    distance[neighbour] = distance[current] + 1;
                }
                q.add(neighbour);
            }
        }

        System.out.println(Arrays.toString(distance));
    }
}
