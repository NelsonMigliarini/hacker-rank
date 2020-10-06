package x28.RegExPatternsDatabases;

import java.util.*;
import java.util.regex.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		Pattern pattern = Pattern.compile("@gmail.com$");
		List<String> nombres = new ArrayList<>();

		for(int NItr = 0; NItr < amount; NItr++) {
			String[] firstNameEmailID = scanner.nextLine().split(" ");
			if(pattern.matcher(firstNameEmailID[1]).find())
				nombres.add(firstNameEmailID[0]);
		}
		Collections.sort(nombres);
		for(String nombre : nombres)
			System.out.println(nombre);
		scanner.close();
	}
}