package x04.ObjectOrientedProgramming.x02.AbstractClass;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
abstract class Book {
	String title;

	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}
}

class MyBook extends Book {
	public void setTitle(String title) {
		this.title = title;
	}
}

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		MyBook newNovel = new MyBook();
		newNovel.setTitle(title);
		System.out.println("The title is: " + newNovel.getTitle());
		sc.close();
	}
}