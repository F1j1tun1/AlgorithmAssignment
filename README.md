<h1>Yerkingali Saruar <br>
IT-2502 Assignment-3 <br>
Algorithms and Data Structures</h1>

<h3>The Questions:</h3>
<b>Which sorting algorithm performed faster? Why?</b>
<p>Quick Sort performed much faster than Bubble Sort because it has a better time complexity for large datasets. This is because Quick Sort uses a divide and 
conquer method while Bubble Sort has to compare every single pair of numbers.</p>
<b>How does performance change with input size?</b>
<p>Performance for Bubble Sort gets much slower when the input size grows from small to large because it is an O(n<sup>2</sup>) algorithm. When you increase the
elements the time it takes increases very fast compared to more advanced algorithms.</p>
<b>How does sorted vs unsorted data affect performance?</b>
<p>Sorted data can make some algorithms faster but it depends on how the code is written to handle already ordered elements. For example Bubble Sort might finish
earlier if there are no swaps but it still often takes more time than advanced sorts.</p>
<b>Do the results match the expected Big-O complexity?</b>
<p>The results I got from the experiment match the expected Big-O complexity since the time measured in nanoseconds increased as the arrays got bigger just like 
the theory says.</p>
<b>Which searching algorithm is more efficient? Why?</b>
<p>Linear Search is not very efficient for large arrays because it has to check every element which takes too much time. It has a complexity of $O(n)$ while other 
types like binary search are much faster.</p>
<b>Why does Binary Search require a sorted array?</b>
<p>Binary Search requires a sorted array because it needs to know which half of the data to skip during the search. If the data is messy it cannot decide if it 
needs to look higher or lower than the middle point.</p>

<hr>
<hr>
<hr>

<h3>A. Project Overview:</h3>
<p>The purpose of this experiment is to measure and analyze the performance of fundamental sorting and searching algorithms in a practical scenario. I implemented 
Bubble Sort for the basic category and Quick Sort for the advanced category while using Linear Search for the searching requirement. This project helps us 
understand how Big-O notation works when you actually measure execution time with real data sizes.</p>

<h3>B. Algorithm Descriptions:</h3>
<p>Bubble Sort is a simple sorting algorithm that works by repeatedly swapping adjacent elements if they are in the wrong order which makes it slow for large 
arrays. Quick Sort is a much faster divide and conquer algorithm that picks a pivot to partition the data into smaller parts. Linear Search is a basic searching 
method that checks every single element in the array one by one until it finds the right value.</p>

<h3>C. Experimental Results:</h3>
<p>I tested these algorithms on different datasets including random and sorted arrays of various sizes including small and medium and large. The results show that 
execution times change a lot depending on the input size and data structure. Look at the next section under.</p>

<h3>D. Screenshots:</h3>
<img width="719" height="342" alt="image" src="https://github.com/user-attachments/assets/f91e190a-df71-4407-bdf0-d5a9ce10abdc" />

<h3>E. Reflection Section:</h3>
<p>Working on this project helped me see how algorithm efficiency works in a real computer program instead of just looking at formulas in a textbook. I learned 
that the difference between O(n<sup>2</sup>) and O(nlog(n)) is not just a math concept because you can actually see the nanoseconds getting much higher for Bubble 
Sort as the array gets bigger. It was very interesting to measure the practical performance and see how things like already sorted data can change how fast a 
program runs.</p>
<p>The hardest part of the implementation was making sure the Experiment class was organized correctly so the results were easy to read. I had to be 
careful with cloning the arrays so that one sorting test did not affect the next one which would have ruined my data. Dealing with nanoseconds was also tricky
since the numbers are very large but it was a good way to see the real speed of the code I wrote.</p>
