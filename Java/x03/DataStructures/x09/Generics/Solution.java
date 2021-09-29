package x03.DataStructures.x09.Generics;

import java.lang.reflect.Method;

/**
 * @author Nelson Migliarini
 */
class Printer {
	public <T> void printArray(T[] array) {
		for(T element : array) {
			System.out.println(element);
		}
	}
}

public class Solution {
	public static void main(String args[]) {
		Printer myPrinter = new Printer();
		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = { "Hello", "World" };
		int count = 0;
		myPrinter.printArray(intArray);
		myPrinter.printArray(stringArray);
		for(Method method : Printer.class.getDeclaredMethods()) {
			String name = method.getName();
			if(name.equals("printArray"))
				count++;
		}
		if(count > 1)
			System.out.println("Method overloading is not allowed!");
	}
}