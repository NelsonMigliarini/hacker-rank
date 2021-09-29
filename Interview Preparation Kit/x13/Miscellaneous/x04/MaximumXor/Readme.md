# Maximum Xor

You are given an array **arr** of **n** elements. A list of integers, **queries** is given as an input, find the maximum value of **queries&#91;j&#93; &#8853; each arr &#91;i&#93;** for all **0 <= i < n**, where **&#8853;** represents [xor](https://en.wikipedia.org/wiki/Exclusive_or) of two elements.

Note that there are multiple test cases in one input file.

For example:

**arr = &#91;3, 7, 15, 10&#93;**

**queries&#91;j&#93; = 3**

**3 &#8853; 3 = 0, max = 0**

**3 &#8853; 7 = 4, max = 4**

**3 &#8853; 15 = 12, max = 12**

**3 &#8853; 10 = 9, max = 9**

**Function Description**

Complete the *maxXor* function in the editor below. It must return an array of integers, each representing the maximum xor value for each element **queries&#91;j&#93;** against all elements of **arr**.

maxXor has the following parameter(s):

- *arr*: an array of integers
- *queries*: an array of integers to query

___


#### HackerRank Challenge

&nbsp;&nbsp;&nbsp;Maximum Xor | [https://www.hackerrank.com/challenges/maximum-xor/problem](https://www.hackerrank.com/challenges/maximum-xor/problem?h_l=interview&playlist_slugs[]=interview-preparation-kit&playlist_slugs[]=miscellaneous)
