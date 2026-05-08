import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> adjList; // Adjacency List representation [cite: 36]

    public Graph() {
        this.adjList = new HashMap<>();
    }
    public void addVertex(Vertex v) {
        adjList.putIfAbsent(v.getId(), new ArrayList<>());
    }
    public void addEdge(int from, int to) {
        if (adjList.containsKey(from) && adjList.containsKey(to)) {
            adjList.get(from).add(to);
        }
    }
    public void printGraph() {
        for (var entry : adjList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public String bfs(int start) {
        StringBuilder sb = new StringBuilder();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            sb.append(vertex).append(" ");
            for (int neighbor : adjList.getOrDefault(vertex, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        return sb.toString().trim();
    }
    public String dfs(int start) {
        StringBuilder sb = new StringBuilder();
        Set<Integer> visited = new HashSet<>();
        dfsRecursive(start, visited, sb);
        return sb.toString().trim();
    }
    private void dfsRecursive(int current, Set<Integer> visited, StringBuilder sb) {
        visited.add(current);
        sb.append(current).append(" ");
        for (int neighbor : adjList.getOrDefault(current, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfsRecursive(neighbor, visited, sb);
            }
        }
    }
    public Set<Integer> getVertices() {
        return adjList.keySet();
    }
}