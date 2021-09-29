package x01.String.x10.ValidUsernameRegex;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static final Scanner scanner = new Scanner(System.in);
	private static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
	
	public static void main(String[] args) {
		int amount = Integer.parseInt(scanner.nextLine());
		while(amount-- != 0) {
			if(scanner.nextLine().matches(regularExpression))
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}
	}
}
