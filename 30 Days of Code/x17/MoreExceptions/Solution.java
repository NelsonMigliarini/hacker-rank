package x17.MoreExceptions;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		while(amount-- > 0) {
			try {
				System.out.println(Calculator.power(scanner.nextInt(), scanner.nextInt()));
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		scanner.close();
	}
}

class NegativeValueException extends Exception {
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "n and p should be non-negative";
	}
}

class Calculator {
	
	private Calculator() {}
	
	public static int power(int base, int exponen) throws NegativeValueException {
		if(base < 0 || exponen < 0)
			throw new NegativeValueException();
		else
			return (int) Math.pow(base, exponen);
	}
}