package aa.helloworld;

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

/**
 * @author Nelson Migliarini
 */
public class Solution {

	public static void main(String[] args) {
		generateMessage();
	}

	private static void generateMessage() {
		out.println(String.format("Hello, World.%n%s", getInputString()));
	}

	private static String getInputString() {
		try (Scanner sc = new Scanner(in)) {
			return sc.nextLine();
		}
	}
}
