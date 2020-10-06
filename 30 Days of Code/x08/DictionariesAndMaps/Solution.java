package x08.DictionariesAndMaps;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static Scanner scanner;
	private static Map<String, Integer> phoneBook = new HashMap<>();

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		generatePhoneBook();
		printPhoneBookContacts();
		scanner.close();
	}

	public static void generatePhoneBook() {
		int amountOfEntries = scanner.nextInt();
		for(int i = 0; i < amountOfEntries; i++)
			phoneBook.put(scanner.next(), scanner.nextInt());
	}

	public static void printPhoneBookContacts() {
		String contactName;
		Integer contactNumber;
		while(scanner.hasNext()) {
			contactName = scanner.next();
			contactNumber = phoneBook.get(contactName);
			System.out.println(contactNumber == null ? "Not found" : contactName + "=" + contactNumber);
		}
	}
}
