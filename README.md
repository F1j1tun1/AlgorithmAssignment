<h1>The Questions</h1>
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

<h1>Project Overview</h1>
<p>The purpose of this experiment is to measure and analyze the performance of fundamental sorting and searching algorithms in a practical scenario. I implemented 
Bubble Sort for the basic category and Quick Sort for the advanced category while using Linear Search for the searching requirement. This project helps us 
understand how Big-O notation works when you actually measure execution time with real data sizes.</p>

<h1>Algorithm Descriptions</h1>
<p>Bubble Sort is a simple sorting algorithm that works by repeatedly swapping adjacent elements if they are in the wrong order which makes it slow for large 
arrays. Quick Sort is a much faster divide and conquer algorithm that picks a pivot to partition the data into smaller parts. Linear Search is a basic searching 
method that checks every single element in the array one by one until it finds the right value.</p>

<h1>Project</h1>
<p>ass</p>

<h1>Project</h1>
<p>ass</p>

<h1>Project</h1>
<p>ass</p>
