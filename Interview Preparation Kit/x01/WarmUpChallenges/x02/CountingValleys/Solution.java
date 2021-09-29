package x01.WarmUpChallenges.x02.CountingValleys;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {

	static int countingValleys(int n, String s) {
		int valleys = 0;
		int level = 0;
		for(char c : s.toCharArray()) {
			if(level == 0 && c == 'D')
				valleys++;
			level = c == 'D' ? --level : ++level;
		}
		return valleys;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		bufferedWriter.close();

		scanner.close();
	}
}
