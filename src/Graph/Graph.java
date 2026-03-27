package Graph;

import java.util.*;

public class Graph {
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

    // Helper class to add Edges as pairs
    static class Edge {
        int dest;
        int weight;

        public Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
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

    // Helper class for Dijkstra algorithm to add the destination and weight as pair
    static class Node {
        int vertex;
        int dist;
        Node(int vertex, int dist) {
            this.vertex = vertex;
            this.dist = dist;
        }
    }

    // Method for finding shortest path for all edges for the source edge
    public void dijkstra(int src) {
        int[] distance = new int[V];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[src] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> a.dist - b.dist);
        pq.add(new Node(src, 0));
        while (!pq.isEmpty()) {
            Node node = pq.poll();
            for (Edge edge : weightedAdjList.get(node.vertex)) {
                if (distance[edge.dest] > distance[node.vertex] + edge.weight) {
                    distance[edge.dest] = distance[node.vertex] + edge.weight;
                    pq.add(new Node(edge.dest, distance[edge.dest]));
                }
            }
        }

        System.out.println("vertex\tDistance");
        for (int i = 0; i < V; i++) {
            System.out.println(i+ "\t" +distance[i]);
        }
    }

    // Method for finding shortest path between source edges to the dest edge
    public void dijkstraForParticularPath(int src, int dest) {
        int[] distance = new int[V];
        int[] parent = new int[V];
        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);

        distance[src] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);
        pq.add(new Node(src, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int u = current.vertex;

            // Optimization: Skip if we found a better way already
            if (current.dist > distance[u]) continue;

            if (u == dest) {
                printPath(parent, dest);
                System.out.println(); // New line after path
                return;
            }

            for (Edge edge : weightedAdjList.get(u)) {
                int v = edge.dest;
                if (distance[v] > distance[u] + edge.weight) {
                    distance[v] = distance[u] + edge.weight;
                    parent[v] = u;
                    pq.add(new Node(v, distance[v]));
                }
            }
        }
        System.out.println("No Path Found");
    }

    // printing the path of the smallest distance
    private void printPath(int[] parent, int current) {
        // Base case: if we reach the source (where parent is -1)
        if (parent[current] == -1) {
            System.out.print(current + " ");
            return;
        }
        // Recursive call first to print in Source -> Destination order
        printPath(parent, parent[current]);
        System.out.print(current + " ");
    }

}
