package x24.MoreLinkedLists;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
class Solution {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Node head = null;
		int amount = scanner.nextInt();
		while(amount-- > 0)
			head = insert(head, scanner.nextInt());
		removeDuplicates(head);
		display(head);
		scanner.close();
	}

	public static Node removeDuplicates(Node head) {
		if(head == null)
			return head;
		else {
			Node node = head;
			while(node.next != null)
				if(node.data == node.next.data)
					node.next = node.next.next;
				else
					node = node.next;
			return head;
		}
	}

	public static Node insert(Node head, int data) {
		Node node = new Node(data);
		if(head == null)
			head = node;
		else if(head.next == null)
			head.next = node;
		else {
			Node start = head;
			while(start.next != null)
				start = start.next;
			start.next = node;
		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while(start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}
}