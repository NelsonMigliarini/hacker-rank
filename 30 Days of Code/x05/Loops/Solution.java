package x05.Loops;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	public static void main(String[] args) {
		multiplesWorker(getInformation());
	}

	public static int getInformation() {
		return new Scanner(System.in).nextInt();
	}

	public static void multiplesWorker(int mainFactor) {
		for(int i = 1; i <= 10; i++)
			System.out.println(mainFactor + " x " + i + " = " + mainFactor * i);
	}
}
