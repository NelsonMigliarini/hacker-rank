package x23.BSTLevelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
class Node {
	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}

class Solution {
	public static void levelOrder(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node current = queue.remove();
			System.out.print(current.data + " ");
			if(current.left != null)
				queue.add(current.left);
			if(current.right != null)
				queue.add(current.right);
		}
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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		Node root = null;
		while(amount-- > 0)
			root = insert(root, scanner.nextInt());
		scanner.close();
		levelOrder(root);
	}
}
