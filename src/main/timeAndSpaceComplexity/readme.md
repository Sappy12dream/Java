DSA:

Data structures: how we organize the data in memory.
Algorithm: how we process the date, set of instructions to solve a problem.


Time & Space Complexity: 
Time complexity: How the number of operations grows as the input grows.
Space complexity: How much extra memory the algorithm uses based on input size n.

Big-O Notation
O(1): Constant time: arr[0] or arr[9] or ....

O(n): Linear time: single loop to an array with incrementing by 1

O(log n): Logarithmic: single loop to an array with incrementing by double

O(n²): Quadratic (nested loops)

1. Find time complexity of:
```
for (int i = 1; i < n; i *= 2) {
    System.out.println(i);
}
```
What’s the space complexity of creating an int[] of size n?

Answer: space complexity: O(1) and time compexity: O(n).

2. 
```
for (int i = 1; i < n; i *= 2) {
    System.out.println(i);
}
```
Answer:
Time: O(log n)
Space: O(1)