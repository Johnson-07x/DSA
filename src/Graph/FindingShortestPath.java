package Graph;

public class FindingShortestPath {
    static void main(String[] args) {
        Graph g = new Graph(7);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(4,5);
        g.addEdge(5,6);

        System.out.println(g.adjList);
        g.BFS(0);
        System.out.println();

        g.DFS(0, new boolean[7]);
        System.out.println();

        g.shortestDistanceBFS(1);
    }
}
