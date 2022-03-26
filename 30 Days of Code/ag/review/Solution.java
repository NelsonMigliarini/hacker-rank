package ag.review;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static final String REGEX = "(\r\n|[\n\r\u2028\u0085])?";

	public static void main(String[] args) {
		try (var sc = new Scanner(in)) {
			var words = sc.nextInt();
			for (var i = 0; i < words; i++) {
				sc.skip(REGEX);
				out.println(mixLetters(sc.nextLine()));
			}
		}
	}

	private static String mixLetters(String word) {
		var evenLetters = new StringBuilder();
		var oddLetters = new StringBuilder();
		for (var i = 0; i < word.length(); i++)
			if (i % 2 == 0)
				evenLetters.append(word.charAt(i));
			else
				oddLetters.append(word.charAt(i));
		return String.format("%s %s", evenLetters.toString(), oddLetters.toString());
	}
}