package x03.ConditionalStatements;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	public static void main(String[] args) {
		getClassification(getInformation());
	}

	public static int getInformation() {
		return new Scanner(System.in).nextInt();
	}

	public static void getClassification(int value) {
		boolean weird = false;
		if(value % 2 != 0 || (value >= 6 && value <= 20))
			weird = true;
		isWeird(weird);
	}

	public static void isWeird(boolean weirdCondition) {
		System.out.println(weirdCondition ? "Weird" : "Not Weird");
	}
}
