# Priority Queue

In computer science, a priority queue is an abstract data type which is like a regular queue, but where additionally each element has a "priority" associated with it. In a priority queue, an element with high priority is served before an element with low priority. - [Wikipedia](https://en.wikipedia.org/wiki/Priority_queue)

------

In this problem we will test your knowledge on [Java Priority Queue](https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html).

There are a number of students in a school who wait to be served. Two types of events, *ENTER* and *SERVED*, can take place which are described below.

- *ENTER*: A student with some priority enters the queue to be served.
- *SERVED*: The student with the highest priority is served (removed) from the queue.

A unique id is assigned to each student entering the queue. The queue serves the students based on the following criteria (priority criteria):

1. The student having the highest *Cumulative Grade Point Average* (CGPA) is served first.
2. Any students having the *same CGPA* will be served by name in ascending case-sensitive alphabetical order.
3. Any students having the *same CGPA and name* will be served in ascending order of the id.

Create the following two classes:

- The Student class should implement:

  - The constructor `Student(int id, String name, double cgpa)`.
  - The method `int getID()` to return the id of the student.
  - The method `String getName()` to return the name of the student.
  - The method `double getCGPA()` to return the CGPA of the student.

- The *Priorities* class should implement the method `List<Student> getStudents(List<String> events)` to process all the given events and return all the students yet to be served in the priority order.

  ___


  #### HackerRank Challenge

  &nbsp;&nbsp;&nbsp;&nbsp;Priority Queue | [https://www.hackerrank.com/challenges/java-priority-queue/problem](https://www.hackerrank.com/challenges/java-priority-queue/problem)