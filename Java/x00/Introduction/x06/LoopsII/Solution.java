package x00.Introduction.x06.LoopsII;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			calculus(a, b, n);
		}
		in.close();
	}

	public static void calculus(int a, int b, int n) {
		int result = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++)
				result += b * Math.pow(2, j);
			System.out.print(a + result + " ");
			result = 0;
		}
		System.out.println();
	}
}