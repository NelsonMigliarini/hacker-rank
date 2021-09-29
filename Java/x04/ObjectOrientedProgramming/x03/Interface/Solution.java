package x04.ObjectOrientedProgramming.x03.Interface;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
interface AdvancedArithmetic {
	int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic {
	public int divisorSum(int number) {
		int sum = number;
		for(int i = 1; i <= number / 2; i++)
			if(number % i == 0)
				sum += i;
		return sum;
	}
}

class Solution {
	public static void main(String[] args) {
		MyCalculator myCalculator = new MyCalculator();
		System.out.print("I implemented: ");
		implementedInterfaceNames(myCalculator);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(myCalculator.divisorSum(n) + "\n");
		sc.close();
	}

	static void implementedInterfaceNames(Object o) {
		Class<?>[] theInterfaces = o.getClass().getInterfaces();
		for(int i = 0; i < theInterfaces.length; i++) {
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}
	}
}
