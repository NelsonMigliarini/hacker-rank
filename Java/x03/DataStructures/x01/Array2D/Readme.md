# 2D Array

You are given a **6 * 6** 2D array. An hourglass in an array is a portion shaped like this:

******
a b c
  d
e f g
******

For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

******
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
******

Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

******
1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
******

The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem you have to print the largest sum among all the hourglasses in the array.

---

#### HackerRank Challenge

&nbsp;&nbsp;&nbsp;&nbsp;2D Array | [https://www.hackerrank.com/challenges/java-2d-array/problem](https://www.hackerrank.com/challenges/java-2d-array/problem)