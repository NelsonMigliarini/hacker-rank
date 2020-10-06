package x29.BitwiseAND;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int amount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for(int tItr = 0; tItr < amount; tItr++) {
			String[] nk = scanner.nextLine().split(" ");
			System.out.println(calcule(Integer.parseInt(nk[0]), Integer.parseInt(nk[1])));
		}
		scanner.close();
	}

	public static int calcule(int n, int k) {
		int value = 0;
		int tempValue;
		boolean flag = true;

		for(int i = 1; i < n && flag; i++)
			for(int j = i + 1; j <= n; j++) {
				tempValue = i & j;
				if(tempValue > value && tempValue < k) {
					value = tempValue;
					if(value == k - 1)
						flag = false;
				}
			}
		return value;
	}
}