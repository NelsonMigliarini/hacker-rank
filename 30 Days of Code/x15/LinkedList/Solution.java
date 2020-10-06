package x15.LinkedList;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class Solution {
	public static Node insert(Node head, int data) {
		Node temp = new Node(data);
		Node current = head;
		Node finalNode = head;

		if(current == null)
			finalNode = temp;
		else {
			while(current.next != null)
				current = current.next;
			current.next = temp;
		}
		return finalNode;
	}

	public static void display(Node head) {
		Node start = head;
		while(start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Node head = null;
		int amount = scanner.nextInt();
		while(amount-- > 0)
			head = insert(head, scanner.nextInt());
		display(head);
		scanner.close();
	}
}