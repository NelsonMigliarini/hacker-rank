package x00.HelloWorld;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println("Hello, World.\n" + getInputString());
	}

	public static String getInputString() {
		return new Scanner(System.in).nextLine();
	}
}
