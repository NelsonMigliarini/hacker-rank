package x03.DataStructures.x13.BitSet;

import java.util.BitSet;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static Scanner scanner = new Scanner(System.in);
	private static BitSet bitSetA;
	private static BitSet bitSetB;
	private static int operations;

	public static void main(String[] args) {
		getInformation();
		bitSetWorker();

		scanner.close();
	}

	private static void bitSetWorker() {
		String regex = "(\r\n|[\n\r\u2028\u2029\u0085])?";
		for(int i = 0; i < operations; i++) {
			String[] operation = scanner.skip(regex).nextLine().split(" ");
			int firstParam = Integer.parseInt(operation[1]);
			int secondParam = Integer.parseInt(operation[2]);
			switch(operation[0]) {
				case "AND":
					operationAND(firstParam);
					break;
				case "OR":
					operationOR(firstParam);
					break;
				case "XOR":
					operationXOR(firstParam);
					break;
				case "FLIP":
					operationFLIP(firstParam, secondParam);
					break;
				case "SET":
					operationSET(firstParam, secondParam);
					break;
				default:
					break;
			}
			printSets();
		}
	}

	public static void getInformation() {
		int size = scanner.nextInt();
		bitSetA = new BitSet(size);
		bitSetB = new BitSet(size);
		operations = scanner.nextInt();
	}

	public static void operationAND(int firstParam) {
		if(firstParam == 1)
			bitSetA.and(bitSetB);
		else
			bitSetB.and(bitSetA);
	}

	public static void operationOR(int firstParam) {
		if(firstParam == 1)
			bitSetA.or(bitSetB);
		else
			bitSetB.or(bitSetA);
	}

	public static void operationXOR(int firstParam) {
		if(firstParam == 1)
			bitSetA.xor(bitSetB);
		else
			bitSetB.xor(bitSetA);
	}

	public static void operationFLIP(int firstParam, int secondParam) {
		if(firstParam == 1)
			bitSetA.flip(secondParam);
		else
			bitSetB.flip(secondParam);
	}

	public static void operationSET(int firstParam, int secondParam) {
		if(firstParam == 1)
			bitSetA.set(secondParam);
		else
			bitSetB.set(secondParam);
	}

	public static void printSets() {
		System.out.println(bitSetA.cardinality() + " " + bitSetB.cardinality());
	}
}
