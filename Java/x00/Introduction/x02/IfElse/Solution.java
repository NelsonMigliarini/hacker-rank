package x00.Introduction.x02.IfElse;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int value = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		if(value % 2 == 1)
			System.out.println("Weird");
		else if(value >= 2 && value <= 5)
			System.out.println("Not Weird");
		else if(value >= 6 && value <= 20)
			System.out.println("Weird");
		else if(value > 20)
			System.out.println("Not Weird");
		scanner.close();
	}
}