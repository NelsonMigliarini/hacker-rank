package x06.Review;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	public static void main(String[] args) {
		String word;
		int wordsAmount;
		Scanner scanner = new Scanner(System.in);
		String regex = "(\r\n|[\n\r\u2028\u2029\u0085])?";
		wordsAmount = scanner.nextInt();
		scanner.skip(regex);
		for(int i = 0; i < wordsAmount; i++) {
			word = scanner.nextLine();
			scanner.skip(regex);
			printStrings(word);
		}
		scanner.close();
	}

	public static void printStrings(String word) {
		StringBuilder evenString = new StringBuilder();
		StringBuilder oddString = new StringBuilder();
		for(int j = 0; j < word.length(); j++)
			if(j % 2 == 0)
				evenString.append(word.charAt(j));
			else
				oddString.append(word.charAt(j));
		System.out.println(evenString.toString() + " " + oddString.toString());
	}
}
