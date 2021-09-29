package x03.DataStructures.x06.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static List<Integer> list = new ArrayList<>();
	private static Scanner scanner;
	private static String regex = "(\r\n|[\n\r\u2028\u2029\u0085])?";

	public static void main(String[] args) {
		listWorker();
		printList();
	}

	public static void listWorker() {
		scanner = new Scanner(System.in);
		scanner.nextInt();
		scanner.skip(regex);
		createListFromString(scanner.nextLine());
		int amountOperations = scanner.nextInt();
		for(int i = 0; i < amountOperations; i++) {
			scanner.skip(regex);
			operations();
		}
		scanner.close();
	}

	private static void operations() {
		switch(scanner.nextLine()) {
			case "Insert":
				insert();
				break;
			case "Delete":
				delete();
				break;
			default:
				break;
		}
	}

	private static void delete() {
		list.remove(Integer.parseInt(scanner.nextLine()));
	}

	private static void insert() {
		String[] intergersString = scanner.nextLine().split(" ");
		list.add(Integer.parseInt(intergersString[0]), Integer.parseInt(intergersString[1]));
	}

	public static void createListFromString(String string) {
		for(String s : Arrays.asList(string.split(" ")))
			list.add(Integer.valueOf(s));
	}

	public static void printList() {
		list.forEach((value) -> System.out.print(value + " "));
	}
}