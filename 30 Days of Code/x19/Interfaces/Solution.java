package x19.Interfaces;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
interface AdvancedArithmetic {
	public int divisorSum(int number);
}

class Calculator implements AdvancedArithmetic {
	private int divisorSum = 0;

	@Override
	public int divisorSum(int number) {
		for(int i = 1; i <= number; i++) {
			if(number % i == 0) {
				divisorSum = divisorSum + i;
			}
		}
		return divisorSum;
	}
}

class Solution {
	private static AdvancedArithmetic calculator = new Calculator();

	public static void main(String[] args) {
		printSolution(getInformation());
	}

	public static int getInformation() {
		return new Scanner(System.in).nextInt();
	}

	public static void printSolution(int solution) {
		System.out.println("I implemented: " + calculator.getClass().getInterfaces()[0].getName());
		System.out.println(calculator.divisorSum(solution));
	}
}