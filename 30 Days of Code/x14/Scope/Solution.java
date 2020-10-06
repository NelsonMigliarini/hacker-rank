package x14.Scope;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
class Difference {
	private int[] elements;
	private int maximumDifference;

	public Difference(int[] array) {
		this.elements = array;
		this.maximumDifference = computeDifference();
	}

	public int computeDifference() {
		Arrays.sort(elements);
		return Math.abs(elements[0] - elements[elements.length - 1]);
	}

	public int getDifference() {
		return maximumDifference;
	}
}

public class Solution {
	private static int[] numbers;

	public static void main(String[] args) {
		getInformation();
		System.out.print(new Difference(numbers).getDifference());
	}

	private static void getInformation() {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		numbers = new int[amount];
		for(int i = 0; i < amount; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();
	}
}