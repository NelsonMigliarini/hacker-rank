package x03.DataStructures.x02.Subarray;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		int[] array = new int[amount];
		int negSubarrays = 0;
		int sum;

		for(int i = 0; i < amount; i++)
			array[i] = scanner.nextInt();
		for(int i = 0; i < amount; i++) {
			sum = 0;
			for(int j = i; j < amount; j++) {
				sum += array[j];
				if(sum < 0)
					negSubarrays++;
			}
		}
		System.out.print(negSubarrays);
		scanner.close();
	}
}