package x03.DataStructures.x04.Array1DPart2;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	static int leap;
	static int[] game;

	public static boolean canWin(int index) {
		if(index < 0 || game[index] == 1)
			return false;
		if(index == game.length - 1 || index + leap >= game.length)
			return true;
		game[index] = 1;
		return canWin(index + 1) || canWin(index - 1) || canWin(index + leap);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while(q-- > 0) {
			int n = scan.nextInt();
			leap = scan.nextInt();
			game = new int[n];
			for(int i = 0; i < n; i++)
				game[i] = scan.nextInt();
			System.out.println((canWin(0)) ? "YES" : "NO");
		}
		scan.close();
	}
}
