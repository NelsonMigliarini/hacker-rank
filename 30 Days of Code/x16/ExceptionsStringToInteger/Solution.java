package x16.ExceptionsStringToInteger;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	public static void main(String[] args) {
		try {
			System.out.println(Integer.parseInt(getInformation()));
		} catch(NumberFormatException e) {
			System.out.println("Bad String");
		}
	}

	public static String getInformation() {
		return new Scanner(System.in).next();
	}
}