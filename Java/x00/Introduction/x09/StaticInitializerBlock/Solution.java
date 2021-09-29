package x00.Introduction.x09.StaticInitializerBlock;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static int b;
	private static int h;
	private static boolean flag;

	static {
		Scanner scanner = new Scanner(System.in);
		b = scanner.nextInt();
		h = scanner.nextInt();
		if(b > 0 && h > 0)
			flag = true;
		else {
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		scanner.close();
	}

	public static void main(String[] args) {
		if(flag) {
			int area = b * h;
			System.out.print(area);
		}
	}
}
