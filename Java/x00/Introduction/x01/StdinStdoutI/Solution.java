package x00.Introduction.x01.StdinStdoutI;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 3; i++)
			System.out.println(scanner.nextInt());
		scanner.close();
	}
}