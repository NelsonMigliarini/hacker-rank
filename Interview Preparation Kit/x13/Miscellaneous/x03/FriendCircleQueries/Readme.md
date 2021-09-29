# Friend Circle Queries

The population of HackerWorld is **10<sup>9</sup>**. Initially, none of the people are friends with each other. In order to start a friendship, two persons **a** and **b** have to shake hands, where **1 <= a, b <= 10<sup>9</sup>**. The friendship relation is transitive, that is if **a** and **b** shake hands with each other, **a** and friends of **a** become friends with **b** and friends of **b**.

You will be given **q** queries. After each query, you need to report the size of the largest friend circle (the largest group of friends) formed after considering that query.

For example, your list of queries is:

```
1 2
3 4
2 3
```

First, **1** and **2** shake hands, forming a circle of **2**. Next, **3** and **4** do the same. Now there are two groups of **2** friends. When **2** and **3** become friends in the next query, both groups of friends are added together to make a circle of **4** friends. We would print

```
2
2
4
```

**Function Description**

Complete the function *maxCircle* in the editor below. It must return an array of integers representing the size of the maximum circle of friends after each query.

maxCircle has the following parameter(s):

- *queries*: an array of integer arrays, each with two elements indicating a new friendship

___


#### HackerRank Challenge

&nbsp;&nbsp;&nbsp;Friend Circle Queries | [https://www.hackerrank.com/challenges/friend-circle-queries/problem](https://www.hackerrank.com/challenges/friend-circle-queries/problem?h_l=interview&playlist_slugs[]=interview-preparation-kit&playlist_slugs[]=miscellaneous&h_r=next-challenge&h_v=zen)