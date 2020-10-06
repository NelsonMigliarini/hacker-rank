package x13.AbstractClasses;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
abstract class Book {
	String title;
	String author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	abstract void display();
}

class MyBook extends Book {
	int price;

	public MyBook(String title, String author, int price) {
		super(title, author);
		this.price = price;
	}

	public void display() {
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Price: " + this.price);
	}
}

public class Solution {
	private static String title;
	private static String author;
	private static int price;

	public static void main(String[] args) {
		getInformation();
		new MyBook(title, author, price).display();
	}

	public static void getInformation() {
		Scanner scanner = new Scanner(System.in);
		title = scanner.nextLine();
		author = scanner.nextLine();
		price = scanner.nextInt();
		scanner.close();
	}
}