package Graph;

public class DijkstraManipulation {
    static void main(String[] args) {
        Graph g = new Graph(5, true);
        g.adEdge(0,1,5);
        g.adEdge(0,2,3);
        g.adEdge(1,3,6);
        g.adEdge(2,4,4);
        g.adEdge(3,2,2);
        g.printWeightedGraph();
        g.dijkstra(0);
    }
}
