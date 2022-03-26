package ac.operators;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {

	public static void main(String[] args) {
		try (var sc = new Scanner(in)) {
			long price = getPrice(sc.nextDouble(), sc.nextInt(), sc.nextInt());
			out.println(price);
		}
	}

	public static long getPrice(double mealCost, int tipPercent, int taxPercent) {
		var tip = mealCost / 100 * tipPercent;
		var tax = mealCost / 100 * taxPercent;
		return Math.round(mealCost + tip + tax);
	}
}
