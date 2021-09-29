package x13.Miscellaneous.x03.FriendCircleQueries;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		printOutput(maxCircle(getInformation()));
		scanner.close();
	}

	public static int[][] getInformation() {
		String regex = "(\r\n|[\n\r\u2028\u2029\u0085])?";
		int amount = scanner.nextInt();
		int[][] queries = new int[amount][2];
		for(int i = 0; i < amount; i++) {
			String[] queriesRowItems = scanner.skip(regex).nextLine().split(" ");
			for(int j = 0; j < 2; j++)
				queries[i][j] = Integer.parseInt(queriesRowItems[j]);
		}
		return queries;
	}

	static int[] maxCircle(int[][] queries) {
		int[] maxCircles = new int[queries.length];
		for(int[] person : queries) {
			DisjointSet.makeSet(person[0]);
			DisjointSet.makeSet(person[1]);
		}
		for(int i = 0; i < queries.length; i++) {
			DisjointSet.union(queries[i][0], queries[i][1]);
			maxCircles[i] = DisjointSet.getMaximum();
		}
		return maxCircles;
	}

	private static void printOutput(int[] answer) {
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {
			for(int i = 0; i < answer.length; i++) {
				bufferedWriter.write(String.valueOf(answer[i]));
				if(i != answer.length - 1)
					bufferedWriter.write("\n");
			}
			bufferedWriter.newLine();
		} catch(IOException e) {
			System.out.println("IOException");
		}
	}
}

class DisjointSet {
	private static Map<Integer, Node> nodes = new HashMap<>();
	private static int maximum = 0;

	private DisjointSet() {}
	
	static class Node {
		int data;
		Node parent;
		int rank;
		
		public Node(int data) {
			this.data = data;
			this.parent = this;
			this.rank = 1;
		}
	}

	public static void makeSet(int data) {
		nodes.put(data, new Node(data));
	}

	public static boolean union(int dataA, int dataB) {
		Node parentA = findParent(dataA);
		Node parentB = findParent(dataB);
		boolean isJustUnited = true;
		if(parentA.data == parentB.data)
			isJustUnited = false;
		else if(parentA.rank >= parentB.rank) {
			parentA.rank = parentA.rank + parentB.rank;
			parentB.parent = parentA;
			setMaximum(Math.max(getMaximum(), parentA.rank));
		} else {
			parentB.rank = parentB.rank + parentA.rank;
			parentA.parent = parentB;
			setMaximum(Math.max(getMaximum(), parentB.rank));
		}
		return isJustUnited;
	}

	private static Node findParent(int data) {
		Node node = nodes.get(data);
		if(node.parent == node)
			return node;
		else
			return findParent(node.parent.data);
	}

	public static int getMaximum() {
		return maximum;
	}

	public static void setMaximum(int maximum) {
		DisjointSet.maximum = maximum;
	}
}