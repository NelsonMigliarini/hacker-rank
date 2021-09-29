package x00.Introduction.x08.EndOfFile;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	public static void main(String[] args) {
		int counter = 1;
		Scanner input = new Scanner(System.in);
		input.skip("(\r\n|[nr2028\u2029\u0085])?");
		while(input.hasNext()) {
			System.out.println(counter + " " + input.nextLine());
			counter++;
		}
		input.close();
	}
}