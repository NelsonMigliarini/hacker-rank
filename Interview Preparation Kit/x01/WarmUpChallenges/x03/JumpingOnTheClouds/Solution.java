package x01.WarmUpChallenges.x03.JumpingOnTheClouds;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {
		int clouds = c.length - 1;
		int jumps = 0;

		for(int i = 0; i < clouds;) {
			if(i + 1 == clouds && c[i + 1] != 1) {
				jumps++;
				i++;
			} else {
				i += c[i + 2] != 1 ? 2 : 1;
				jumps++;
			}
		}
		return jumps;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] c = new int[n];

		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for(int i = 0; i < n; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}

		int result = jumpingOnClouds(c);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		bufferedWriter.close();

		scanner.close();
	}
}
