<h1>Yerkingali Saruar <br>
IT-2502 Assignment-4 <br>
Algorithms and Data Structures</h1>


<h2>Analysis Questions</h2>
<b>1. How does graph size affect BFS and DFS performance?</b>
As the number of vertices (V) and edges (E) increase, both algorithms take more time. Since they are O(V+E), the time growth is mostly linear relative to the 
total size of the graph structure.

<b>2. Which traversal is faster in your experiments?</b>
In my tests, BFS usually finished a bit faster than DFS. I think this is because DFS uses recursion which has some overhead on the system stack, while BFS uses a 
simple Queue.

<b>3. Do results match the expected complexity O(V+E)?</b>
Yes, when I moved from 10 to 100 vertices, the time didn't explode exponentially. It stayed within a reasonable range that follows the O(V+E) pattern.

<b>4. How does graph structure affect traversal order?</b>
The order changes alot based on how edges are connected. If the graph is very deep, DFS goes way down one path first. If the graph is wide or flat, BFS visits all 
immediate neighbors first which looks very different in the output.

<b>5. When is BFS preferred over DFS?</b>
BFS is better when you need to find the shortest path in an unweighted graph. It is also good if you know the target node is close to the starting point.

<b>6. What are the limitations of DFS?</b>
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
10 Vertices  | BFS: 145,200       | DFS: 180,500 <br>
30 Vertices  | BFS: 320,800       | DFS: 355,100 <br>
100 Vertices | BFS: 1,105,400     | DFS: 1,210,300 <br>

<h2>E Screenshots</h2>


<h2>F Reflection</h2>
I learned how much the data structure matters for graphs. Using an adjacency list made it easy to iterate through neighbors. The main challenge was making sure I 
didn't visit the same node twice, which would cause an infinite loop in the DFS. BFS was easier to visualize with the queue, but DFS is very clean to write with 
recursion.
