package Graph;

import java.util.*;

public class Graph {
    static class Edge {
        int dest;
        int weight;

        public Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }
    ArrayList<ArrayList<Integer>> adjList; // ArrayList for normal unWeighted graph
    ArrayList<ArrayList<Edge>> weightedAdjList; // ArrayList for Weighted graph
    int V;
    Graph(int V, boolean checkNormalOrWeighted) {
        this.V = V;
        // If weighted execute this...
        if (checkNormalOrWeighted) {
            weightedAdjList = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                weightedAdjList.add(new ArrayList<>());
            }
        } else {
            adjList = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                adjList.add(new ArrayList<>());
            }
        }
    }

    // Vertex adding method for Directed (or) Undirected graph without weight
    void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
//        adjList.get(dest).add(src); // Need to add both side if it's a Undirected graph
    }

    // Vertex adding method for Directed (or) Undirected graph with weight
    void adEdge(int src, int dest, int weight) {
        weightedAdjList.get(src).add(new Edge(dest, weight));
        weightedAdjList.get(dest).add(new Edge(src, weight));
    }

    // Method for printing Weighted and Undirected graph
    public void printWeightedGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " => ");
            for (Edge edge : weightedAdjList.get(i)) {
                System.out.print("[" + i + "->" + edge.dest + " " + "[" + edge.weight + "]" + "]" + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // BFS traversal -> exact similar to LevelOrder traversal
    void BFS(int start) {
        boolean[] visited = new boolean[V];
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
        int[] distance = new int[V];
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

    static class Node {
        int dest;
        int weight;
        Node(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    public void dijkstra(int src) {
        int[] distance = new int[V];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[src] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> a.weight - b.weight);
        pq.add(new Node(src, 0));
        while (!pq.isEmpty()) {
            Node node = pq.poll();
            for (Edge edge : weightedAdjList.get(node.dest)) {
                if (distance[edge.dest] > distance[node.dest] + edge.weight) {
                    distance[edge.dest] = distance[node.dest] + edge.weight;
                    pq.add(new Node(edge.dest, distance[edge.dest]));
                }
            }
        }

        System.out.println("vertex\tDistance");
        for (int i = 0; i < V; i++) {
            System.out.println(i+ "\t" +distance[i]);
        }
    }
}
