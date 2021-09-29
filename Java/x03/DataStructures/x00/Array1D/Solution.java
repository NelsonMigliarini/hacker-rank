package x03.DataStructures.x00.Array1D;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		int[] array = new int[amount];
		for(int i = 0; i < amount; i++)
			array[i] = scanner.nextInt();
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]);
		scanner.close();
	}
}