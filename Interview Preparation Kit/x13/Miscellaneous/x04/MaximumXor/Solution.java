package x13.Miscellaneous.x04.MaximumXor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Solution {
	private static Scanner scanner = new Scanner(System.in);
	private static int[] array;
	private static int[] queries;

	public static void main(String[] args) {
		getInformation();
		printOutput(maxXor());
		scanner.close();
	}

	public static int[] maxXor() {
		int[] values = new int[queries.length];
		Node root = new Node();
		for(int i = 0; i < array.length; i++)
			root.insert(root, array[i]);
		for(int i = 0; i < queries.length; i++)
			values[i] = root.getMaxXor(root, queries[i]);
		return values;
	}

	public static void getInformation() {
		String regex = "(\r\n|[\n\r\u2028\u2029\u0085])?";
		array = new int[scanner.nextInt()];
		String[] arrItems = scanner.skip(regex).nextLine().split(" ");
		for(int i = 0; i < array.length; i++)
			array[i] = Integer.parseInt(arrItems[i]);
		queries = new int[scanner.nextInt()];
		for(int i = 0; i < queries.length; i++)
			queries[i] = scanner.nextInt();
	}

	public static void printOutput(int[] result) {
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {
			for(int i = 0; i < result.length; i++) {
				bufferedWriter.write(String.valueOf(result[i]));
				if(i != result.length - 1)
					bufferedWriter.write("\n");
			}
			bufferedWriter.newLine();
		} catch(IOException e) {
			System.out.println("IOException");
		}
	}
}

class Node {
	Node left, right;

	public void insert(Node root, int data) {
		for(int i = 31; i >= 0; i--) {
			if(((data >> i) & 1) == 0) {
				if(root.left == null)
					root.left = new Node();
				root = root.left;
			} else {
				if(root.right == null)
					root.right = new Node();
				root = root.right;
			}
		}
	}

	public int getMaxXor(Node root, int data) {
		int maximum = 0;
		for(int i = 31; i >= 0; i--) {
			if(((data >> i) & 1) == 0) {
				if(root.right != null) {
					maximum += Math.pow(2, i);
					root = root.right;
				} else
					root = root.left;
			} else {
				if(root.left != null) {
					maximum += Math.pow(2, i);
					root = root.left;
				} else
					root = root.right;
			}
		}
		return maximum;
	}
}
