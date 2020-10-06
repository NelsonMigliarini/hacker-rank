package x22.BinarySearchTrees;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		Node root = null;
		while(amount-- > 0)
			root = Node.insert(root, scanner.nextInt());
		scanner.close();
		System.out.println(Node.getHeight(root));
	}
}

class Node {
	Node left;
	Node right;
	int data;

	private Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}

	public static Node insert(Node root, int data) {
		if(root == null)
			return new Node(data);
		else {
			if(data <= root.data)
				root.left = insert(root.left, data);
			else
				root.right = insert(root.right, data);
			return root;
		}
	}

	public static int getHeight(Node root) {
		if(root == null || (root.left == null && root.right == null))
			return 0;
		else {
			int leftValue = getHeight(root.left);
			int rightValue = getHeight(root.right);
			return 1 + (leftValue >= rightValue ? leftValue : rightValue);
		}
	}
}
