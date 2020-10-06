# Sorting

**Objective**

Today, we're discussing a simple sorting algorithm called Bubble Sort. Check out the [Tutorial](https://www.hackerrank.com/challenges/30-sorting/tutorial) tab for learning materials and an instructional video!

---

Consider the following version of Bubble Sort:

```java
for (int i = 0; i < n; i++) {
    // Track number of elements swapped during a single array traversal
    int numberOfSwaps = 0;
    
    for (int j = 0; j < n - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a[j] > a[j + 1]) {
            swap(a[j], a[j + 1]);
            numberOfSwaps++;
        }
    }

    // If no elements were swapped during a traversal, array is sorted
    if (numberOfSwaps == 0) {
        break;
    }
}
```
**Task**

Given an array, **a**, of size **n** distinct elements, sort the array in ascending order using the Bubble Sort algorithm above. Once sorted, print the following **3** lines:

1. Array is sorted in numSwaps swaps.
   where **numSwamps** is the number of swaps that took place.
2. First Element: firstElement
   where **firstElement** is the first element in the sorted array.
3. Last Element: lastElement
   where **lastElement** is the last element in the sorted array.

**Hint:** To complete this challenge, you will need to add a variable that keeps a running tally of all swaps that occur during execution.

___

HackerRank challenge | [https://www.hackerrank.com/challenges/30-sorting/problem](https://www.hackerrank.com/challenges/30-sorting/problem)

