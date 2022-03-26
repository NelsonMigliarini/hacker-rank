package ah.arrays;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static final String REGEX = "(\r\n|[\n\r\u2028\u2029\u0085])?";

	public static void main(String[] args) {
		try (var sc = new Scanner(in)) {
			var amount = sc.nextInt();
			sc.skip(REGEX);
			out.println(invertArray(amount, sc.nextLine().split(" ")));
		}
	}

	private static String invertArray(int amount, String[] elements) {
		var inversion = new StringBuilder();
		inversion.append(elements[amount - 1]);
		for (var i = amount - 2; i >= 0; i--)
			inversion.append(" " + elements[i]);
		return inversion.toString();
	}
}
