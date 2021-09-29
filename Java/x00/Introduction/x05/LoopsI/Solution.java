package x00.Introduction.x05.LoopsI;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int number = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		multiples(number);
		scanner.close();
	}

	public static void multiples(int number) {
		for(int i = 0; i < 10; i++)
			System.out.println(number + " x " + (i + 1) + " = " + number * (i + 1));
	}
}
