package Graph;

public class Manipulation {
    static void main(String[] args) {
        Graph g = new Graph(8, false);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,4);
        g.addEdge(2,5);
        g.addEdge(3,6);
        g.addEdge(4,7);
        g.addEdge(5,7);
        g.addEdge(6,7);

        System.out.println(g.adjList);
        g.BFS(0);
        System.out.println();

        g.DFS(0, new boolean[8]);
    }
}
