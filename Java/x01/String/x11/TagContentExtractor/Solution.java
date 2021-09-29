package x01.String.x11.TagContentExtractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int testCases = Integer.parseInt(scanner.nextLine());
		getClearLines(testCases);
	}

	private static void getClearLines(int testCases) {
		Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
		while (testCases-- > 0) {
			boolean matchFound = false;
			Matcher match = pattern.matcher(scanner.nextLine());
			while (match.find()) {
				System.out.println(match.group(2));
				matchFound = true;
			}
			if (!matchFound)
				System.out.println("None");
		}
	}
}
