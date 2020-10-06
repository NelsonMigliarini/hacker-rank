package x26.NestedLogic;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static int[] returned = new int[3];
	private static int[] expected = new int[3];

	public static void main(String[] args) {
		getInformation();
		System.out.println(getFee());
	}

	public static void getInformation() {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 6; i++)
			if(i < 3)
				returned[i] = scanner.nextInt();
			else
				expected[i - 3] = scanner.nextInt();
		scanner.close();
	}

	public static int getFee() {
		int yearsDiff = returned[2] - expected[2];
		int monthsDiff = returned[1] - expected[1];
		int daysDiff = returned[0] - expected[0];
		if(yearsDiff > 0)
			return 10000;
		else if(yearsDiff == 0) {
			if(monthsDiff > 0) {
				return 500 * monthsDiff;
			} else if(daysDiff > 0) {
				return 15 * daysDiff;
			}
		}
		return 0;
	}
}