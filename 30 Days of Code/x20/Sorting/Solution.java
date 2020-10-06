package x20.Sorting;

import java.util.*;

public class Solution {
	private static int[] array;
	private static int length;
	private static int swamps = 0;

	public static void main(String[] args) {
		getInformation();
		int tempInt;
		for(int i = 0; i < length; i++)
			for(int j = 0; j < length - 1; j++)
				if(array[j] > array[j + 1]) {
					tempInt = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tempInt;
					swamps++;
				}
		printOutput();
	}

	public static void getInformation() {
		Scanner scanner = new Scanner(System.in);
		length = scanner.nextInt();
		array = new int[length];
		for(int i = 0; i < length; i++)
			array[i] = scanner.nextInt();
		scanner.close();
	}

	public static void printOutput() {
		System.out.println(String.format("Array is sorted in %s swaps.%nFirst Element: %s %nLast Element: %s", swamps,
				array[0], array[length - 1]));
	}
}