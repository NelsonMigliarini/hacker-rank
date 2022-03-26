package ai.dictionaries;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/**
 * @author Nelson Migliarini
 */
public class Solution {

	public static void main(String[] args) {
		try (var sc = new Scanner(in)) {
			var phoneBook = createPhoneBook(sc.nextInt(), sc);
			out.print(getPhoneNumbers(phoneBook, sc));
		}
	}

	private static Map<String, Integer> createPhoneBook(int entries, Scanner sc) {
		Map<String, Integer> phoneBook = new HashMap<>();
		for (var i = 0; i < entries; i++)
			phoneBook.put(sc.next(), sc.nextInt());
		return phoneBook;
	}

	private static String getPhoneNumbers(Map<String, Integer> phoneBook, Scanner sc) {
		var phoneNumbers = new StringBuilder();
		while (sc.hasNext()) {
			var name = sc.next();
			if (phoneBook.containsKey(name))
				phoneNumbers.append(String.format("%s=%s%n", name, phoneBook.get(name)));
			else
				phoneNumbers.append("Not found\n");
		}
		return phoneNumbers.toString();
	}
}