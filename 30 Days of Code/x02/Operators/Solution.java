package x02.Operators;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static double mealCost;
	private static int tipPercent;
	private static int taxPercent;

	public static void main(String[] args) {
		getInformation();
		getTotalCost();
	}

	public static void getInformation() {
		Scanner scanner = new Scanner(System.in);
		mealCost = scanner.nextDouble();
		tipPercent = scanner.nextInt();
		taxPercent = scanner.nextInt();
		scanner.close();
	}

	public static void getTotalCost() {
		System.out.println(Math.round(mealCost + mealCost * tipPercent / 100 + mealCost * taxPercent / 100));
	}
}
