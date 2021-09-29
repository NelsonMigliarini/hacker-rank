package x02.Arrays.x01.Array2D;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static final Scanner scanner = new Scanner(System.in);
	private static int[][] array2D = new int[6][6];

	public static void main(String[] args) throws IOException {
		createArray();
		printOutput(hourglassSum());
	}

	private static void createArray() {
		String regex = "(\r\n|[\n\r\u2028\u2029\u0085])?";
		for(int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.skip(regex).nextLine().split(" ");
			for(int j = 0; j < 6; j++)
				array2D[i][j] = Integer.parseInt(arrRowItems[j]);
		}
		scanner.close();
	}

	static String hourglassSum() {
		int maxValue = -63;
		int tempValue = 0;

		for(int i = 0; i < array2D.length - 2; i++) {
			for(int j = 0; j < array2D[0].length - 2; j++) {
				tempValue = array2D[i][j]
					+ array2D[i][j + 1] + array2D[i][j + 2]
					+ array2D[i + 1][j + 1] + array2D[i + 2][j] + array2D[i + 2][j + 1]
					+ array2D[i + 2][j + 2];
				maxValue = tempValue > maxValue ? tempValue : maxValue;
			}
		}
		return String.valueOf(maxValue);
	}

	public static void printOutput(String result) {
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {
			bufferedWriter.write(String.valueOf(result));
		} catch(IOException e) {
			System.out.println("IOException");
		}
	}
}
