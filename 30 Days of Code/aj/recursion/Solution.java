package aj.recursion;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {

	public static void main(String[] args) {
		try (var sc = new Scanner(in)) {
			out.println(factorial(sc.nextInt()));
		}
	}

	public static int factorial(int number) {
		if (number == 1)
			return 1;
		else
			return number * factorial(number - 1);
	}
}
