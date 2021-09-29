# 1D Array (Part 2)

Let's play a game on an array! You're standing at index `0` of an `n`-element array named `game`. From some index `i` (where `0 <= i < n`), you can perform one of the following moves:

Move Backward: If cell `i - 1` exists and contains a `0`, you can walk back to cell `i - 1`.
Move Forward:
If cell `i + 1` contains a zero, you can walk to cell `i + 1`.
If cell `i + leap` contains a zero, you can jump to cell `i + leap`.
If you're standing in cell `n - 1` or the value of `i + leap >= n`, you can walk or jump off the end of the array and win the game.
In other words, you can move from index `i` to index `i + 1`, `i - 1`, or `i +leap` as long as the destination index is a cell containing a `0`. If the destination index is greater than `n - 1`, you win the game.

Given `leap` and `game`, complete the function in the editor below so that it returns true if you can win the game (or false if you cannot).

---

#### HackerRank Challenge

  Java 1D Array (Part 2) | [https://www.hackerrank.com/challenges/java-1d-array/problem](https://www.hackerrank.com/challenges/java-1d-array/problem)