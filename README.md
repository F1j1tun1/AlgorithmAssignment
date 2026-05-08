<h1>Yerkingali Saruar <br>
IT-2502 Assignment-4 <br>
Algorithms and Data Structures</h1>


<h2>Analysis Questions</h2>
<b>1. How does graph size affect BFS and DFS performance?</b>
As the number of vertices (V) and edges (E) increase, both algorithms take more time. Since they are O(V+E), the time growth is mostly linear relative to the total size of the graph structure.

<b>2. Which traversal is faster in your experiments?</b>
In my tests, BFS usually finished a bit faster than DFS. I think this is because DFS uses recursion which has some overhead on the system stack, while BFS uses a simple Queue.

<b>3. Do results match the expected complexity O(V+E)?</b>
Yes, when I moved from 10 to 100 vertices, the time didn't explode exponentially. It stayed within a reasonable range that follows the O(V+E) pattern.

<b>4. How does graph structure affect traversal order?</b>
The order changes alot based on how edges are connected. If the graph is very deep, DFS goes way down one path first. If the graph is wide or flat, BFS visits all immediate neighbors first which looks very different in the output.

<b>5. When is BFS preferred over DFS?</b>
BFS is better when you need to find the shortest path in an unweighted graph. It is also good if you know the target node is close to the starting point.

<b>6. What are the limitations of DFS?</b>
DFS can get stuck in very deep paths and might cause a StackOverflow error if the graph is too big and you use recursion. It also doesn't guarantee the shortest path like BFS does.

---

## Project Overview
This project implements a Graph Representation System using an **Adjacency List**. We use **Vertices** to represent points and **Edges** for the links between them. The main goal is to compare **Breadth-First Search (BFS)** and **Depth-First Search (DFS)** algorithms.

## Class Descriptions
- **Vertex**: Holds the unique ID for each node.
- **Edge**: Represents a directed connection from a source to a destination.
- **Graph**: The main structure. It uses a `Map<Integer, List<Integer>>` for the Adjacency List, which is memory efficient for sparse graphs.
- **Experiment**: Utility class to automate testing and measure time using `System.nanoTime()`.

## Algorithm Descriptions
### BFS (Breadth-First Search)
- **Steps**: Uses a Queue. Visit start node, mark visited, then visit all neighbors. Repeat for each neighbor in the queue.
- **Use Case**: Shortest path, Social networking "friends of friends".
- **Complexity**: $O(V+E)$

### DFS (Depth-First Search)
- **Steps**: Uses Recursion (or a Stack). Visit start node, then immediately visit the first unvisited neighbor and go as deep as possible before backtracking.
- **Use Case**: Solving puzzles (mazes), topological sorting.
- **Complexity**: $O(V+E)$

## Experimental Results
| Graph Size | BFS Time (ns) | DFS Time (ns) |
|------------|---------------|---------------|
| 10 Vertices| 145,200       | 180,500       |
| 30 Vertices| 320,800       | 355,100       |
| 100 Vertices| 1,105,400    | 1,210,300     |

**Observations:** Performance remains stable as size increases. DFS is slightly slower due to recursive calls.

## Reflection
I learned how much the data structure matters for graphs. Using an adjacency list made it easy to iterate through neighbors. The main challenge was making sure I didn't visit the same node twice, which would cause an infinite loop in the DFS. BFS was easier to visualize with the queue, but DFS is very clean to write with recursion.
