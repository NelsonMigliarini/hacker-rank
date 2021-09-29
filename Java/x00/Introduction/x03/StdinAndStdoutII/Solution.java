package x00.Introduction.x03.StdinAndStdoutII;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int integerValue = scanner.nextInt();
		double doubleValue = scanner.nextDouble();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		String stringValue = scanner.nextLine();

		System.out.println("String: " + stringValue);
		System.out.println("Double: " + doubleValue);
		System.out.println("Int: " + integerValue);
	}
}