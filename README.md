<h1>Project Overview</h1>
<p>The main goal of this assignment is to implement and compare different sorting and searching algorithms to see how they work in real life[cite: 1, 3]. I chose Bubble Sort for the basic category and Quick Sort for the advanced one while using Linear Search for the searching part[cite: 9, 13, 16, 19]. The system measures how many nanoseconds it takes to run these on small and large arrays to analyze the efficiency[cite: 4, 41, 70, 72].</p>

<h1>Algorithm Descriptions</h1>
<p>Bubble Sort is a basic algorithm that checks every pair of numbers and swaps them if the order is wrong which makes it quite slow for big data[cite: 13, 86, 87]. Quick Sort is an advanced method that uses a pivot to split the array and sort it much faster[cite: 16, 86, 87]. Linear Search just looks through every item one by one until it finds the target or reaches the end of the list[cite: 19, 86, 87].</p>

<h1>Experimental Results</h1>
<p>I ran the code for sizes 10 and 100 and 1000 to see the differences[cite: 56, 57, 58]. For 1000 elements the Bubble Sort was very slow compared to the Quick Sort which proves the theory[cite: 72, 73, 80]. You can find the specific nanosecond values in the screenshots folder[cite: 96, 97, 113].</p>

<h1>The Questions</h1>
<p>Quick Sort performed faster because it uses a more efficient way to divide the data while Bubble Sort has to do too many swaps[cite: 80]. Performance gets much worse for Bubble Sort when the input size grows because it is an O(n squared) algorithm[cite: 3, 80, 81]. Sorted data helps some algorithms run faster but Linear Search still has to check everything if the item is at the end[cite: 81]. My results matched the expected Big-O complexity since the times increased like the math predicted[cite: 81]. Linear Search is not very efficient for large arrays because it takes too long to find things[cite: 82]. Binary Search requires a sorted array so it can skip half the numbers each time it looks[cite: 82].</p>

<h1>Project Reflection</h1>
<p>I learned that choosing the right algorithm is very important for coding because some are just too slow for large amounts of data[cite: 101, 102]. Comparing theoretical times to the actual nanoseconds measured in the program was very interesting[cite: 102, 103]. The hardest part was making sure the code was organized properly in different files[cite: 103].</p>
