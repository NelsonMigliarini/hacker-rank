package x03.DataStructures.x05.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
class Solution {

	public static void main(String[] argh) {
		Map<String, Integer> phoneBook = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		scanner.nextLine();

		for(int i = 0; i < amount; i++) {
			phoneBook.put(scanner.nextLine(), scanner.nextInt());
			scanner.nextLine();
		}
		while(scanner.hasNext()) {
			String key = scanner.nextLine();
			if(phoneBook.containsKey(key))
				System.out.println(key + "=" + phoneBook.get(key));
			else
				System.out.println("Not found");
		}
	}
}
