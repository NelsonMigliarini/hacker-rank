package x07.Arrays;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	public static void main(String[] args) {
		printArray(getInformation());
	}

	public static int[] getInformation() {
		Scanner scanner = new Scanner(System.in);
		String regex = "(\r\n|[\n\r\u2028\u2029\u0085])?";
		int[] numbers = new int[scanner.nextInt()];
		scanner.skip(regex);
		String[] elements = scanner.nextLine().split(" ");
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = Integer.parseInt(elements[i]);
		scanner.close();
		return numbers;
	}

	public static void printArray(int[] numbers) {
		System.out.print(numbers[numbers.length - 1]);
		for(int i = numbers.length - 2; i >= 0; i--)
			System.out.print(" " + numbers[i]);
	}
}
