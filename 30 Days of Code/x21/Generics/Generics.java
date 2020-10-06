package x21.Generics;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
class Printer<T> {
	public void printArray(T[] array) {
		for(T element : array)
			System.out.println(element);
	}
}

public class Generics {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		Integer[] intArray = new Integer[amount];
		for(int i = 0; i < amount; i++)
			intArray[i] = scanner.nextInt();

		amount = scanner.nextInt();
		String[] stringArray = new String[amount];
		for(int i = 0; i < amount; i++)
			stringArray[i] = scanner.next();

		Printer<Integer> intPrinter = new Printer<>();
		Printer<String> stringPrinter = new Printer<>();
		intPrinter.printArray(intArray);
		stringPrinter.printArray(stringArray);
		if(Printer.class.getDeclaredMethods().length > 1)
			System.out.println("The Printer class should only have 1 method named printArray.");
		scanner.close();
	}
}