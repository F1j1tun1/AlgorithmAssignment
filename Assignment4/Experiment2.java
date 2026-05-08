import java.util.Random;

public class Experiment2 {
    public void runTraversals(Graph g, int startNode, int size) {
        long startBfs = System.nanoTime();
        String bfsOrder = g.bfs(startNode);
        long endBfs = System.nanoTime();

        long startDfs = System.nanoTime();
        String dfsOrder = g.dfs(startNode);
        long endDfs = System.nanoTime();

        if (size == 10) {
            System.out.println("BFS Order: " + bfsOrder);
            System.out.println("DFS Order: " + dfsOrder);
        }

        System.out.println("Size: " + size + " | BFS: " + (endBfs - startBfs) + "ns | DFS: " + (endDfs - startDfs) + "ns");
    }
    public Graph createRandomGraph(int vertices, int edges) {
        Graph g = new Graph();
        for (int i = 0; i < vertices; i++) {
            g.addVertex(new Vertex(i));
        }
        Random rand = new Random();
        for (int i = 0; i < edges; i++) {
            g.addEdge(rand.nextInt(vertices), rand.nextInt(vertices));
        }
        return g;
    }
    public void runMultipleTests() {
        int[] sizes = {10, 30, 100};

        System.out.println("==============================================================================");
        for (int size : sizes) {
            Graph g = createRandomGraph(size, size * 2);
            runTraversals(g, 0, size);
        }
        System.out.println("==============================================================================");
    }
}