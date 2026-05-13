<h1>Yerkingali Saruar <br>
IT-2502 Assignment-4 <br>
Algorithms and Data Structures</h1>



<h2>Analysis Questions</h2>

<b>1. How does graph size affect BFS and DFS performance?</b> <br>
As the number of vertices and edges increase, both algorithms take more time. Since they are O(V+E), the time growth is mostly linear relative to the   
total size of the graph structure.

<b>2. Which traversal is faster in your experiments?</b> <br>
DFS usually finished a bit faster than BFS. I think this is because DFS uses recursion, while BFS uses a simple Queue.

<b>3. Do results match the expected complexity O(V+E)?</b> <br>
Yes, when I moved from 10 to 100 vertices, the time didn't explode exponentially. It stayed within a reasonable range that follows the O(V+E) pattern.

<b>4. How does graph structure affect traversal order?</b> <br>
The order changes alot based on how edges are connected. If the graph is very deep, DFS goes way down one path first. If the graph is wide or flat, BFS visits all 
immediate neighbors first which looks very different in the output.

<b>5. When is BFS preferred over DFS?</b> <br>
BFS is better when you need to find the shortest path in an unweighted graph. It is also good if you know the target node is close to the starting point.

<b>6. What are the limitations of DFS?</b> <br>
DFS can get stuck in very deep paths and might cause a StackOverflow error if the graph is too big and you use recursion. It also doesn't guarantee the shortest 
path like BFS does.

<hr>

<h2>A Project Overview</h2>
This project implements a Graph Representation System using an Adjacency List. We use Vertices to represent points and Edges for the links between 
them. The main goal is to compare Breadth-First Search (BFS) and Depth-First Search (DFS) algorithms.

<h2>B Class Descriptions</h2>
Vertex: Holds the unique ID for each node.
Edge: Represents a directed connection from a source to a destination.
Graph: The main structure. It uses a <b>Map<Integer, List<Integer>></b> for the Adjacency List, which is memory efficient for sparse graphs.
Experiment: Utility class to automate testing and measure time using System.nanoTime().

<h2>C Algorithm Descriptions</h2>
<b>BFS (Breadth-First Search)</b>
Steps: Uses a Queue. Visit start node, mark visited, then visit all neighbors. Repeat for each neighbor in the queue.
Use Case: Shortest path, Social networking "friends of friends".
Complexity: O(V+E)

<b>DFS (Depth-First Search)</b>
Steps: Uses Recursion. Visit start node, then immediately visit the first unvisited neighbor and go as deep as possible before backtracking.
Use Case: Solving puzzles, topological sorting.
Complexity: O(V+E)

<h2>D Experimental Results</h2>
Observation: <br>
10 Vertices  | BFS: 1086100   | DFS: 40200 <br>
30 Vertices  | BFS: 44800     | DFS: 13300 <br>
100 Vertices | BFS: 17300     | DFS: 6500 <br>

<h2>E Screenshots</h2>
<img width="376" height="167" alt="image" src="https://github.com/user-attachments/assets/22d07d9a-44e5-4903-8a55-712f26500e39" />

<h2>F Reflection</h2>
I learned how to represent directed graphs using an adjacency list, which is more memory efficient than a matrix. I observed that DFS was usually faster in my 
tests because it uses a simple recursive stack, while BFS has the extra overhead of managing a Queue object. A challenge was managing the output to show the small 
graph traversal order for points while keeping the 30 and 100-vertex results clean for the report. My results also showed how the JVM warmup makes the first test 
look slower, but the overall patterns confirm the O(V+E) complexity for both algorithms.
