package x13.Miscellaneous.x01.FlippingBits;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static final Scanner scanner = new Scanner(System.in);

	static long flippingBits(long number) {
		String binary = String.format("%1$" + 32 + "s", Long.toBinaryString(number)).replace(' ', '0');
		String invertedBinary = binary.replace("0", "x").replace("1", "0").replace("x", "1");
		return Long.parseLong(invertedBinary, 2);
	}

	public static void main(String[] args) throws IOException {
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {
			int amount = scanner.nextInt();
			for(int i = 0; i < amount; i++)
				bufferedWriter.write(String.valueOf(flippingBits(scanner.nextLong())) + "\n");
		} catch(IOException e) {
			System.out.println("IOException");
		} finally {
			scanner.close();
		}
	}
}
