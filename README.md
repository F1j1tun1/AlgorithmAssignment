<h1>The Questions</h1>
<b>Which sorting algorithm performed faster? Why?</b>
<p>Quick Sort performed much faster than Bubble Sort because it has a better time complexity for large datasets. This is because Quick Sort uses a divide and conquer 
method while Bubble Sort has to compare every single pair of numbers.</p>
<b>How does performance change with input size?</b>
<p>Performance for Bubble Sort gets much slower when the input size grows from small to large because it is an O(n<sup>2</sup>) algorithm. When you increase the
elements the time it takes increases very fast compared to more advanced algorithms.</p>
<b>How does sorted vs unsorted data affect performance?</b>
<p>Sorted data can make some algorithms faster but it depends on how the code is written to handle already ordered elements. For example Bubble Sort might finish
earlier if there are no swaps but it still often takes more time than advanced sorts.</p>
<b>Do the results match the expected Big-O complexity?</b>
<p>The results I got from the experiment match the expected Big-O complexity since the time measured in nanoseconds increased as the arrays got bigger just like the 
theory says.</p>
<b>Which searching algorithm is more efficient? Why?</b>
<p>Linear Search is not very efficient for large arrays because it has to check every element which takes too much time. It has a complexity of $O(n)$ while other 
types like binary search are much faster.</p>
<b>Why does Binary Search require a sorted array?</b>
<p>Binary Search requires a sorted array because it needs to know which half of the data to skip during the search. If the data is messy it cannot decide if it needs
to look higher or lower than the middle point.</p>
