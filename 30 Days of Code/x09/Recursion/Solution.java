package x09.Recursion;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(getFactorial(getInformation()));
	}

	public static int getInformation() {
		return new Scanner(System.in).nextInt();
	}

	static int getFactorial(int number) {
		if(number <= 1)
			return 1;
		return number * getFactorial(number - 1);
	}
}
