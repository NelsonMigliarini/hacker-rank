package x02.Arrays.x02.ArraysLeftRotation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static int rotations;
	private static int[] array;

  public static int[] rotLeft() {
		int arrayLength = array.length;
		int[] rotatedArray = new int[arrayLength];
		System.arraycopy(array, rotations, rotatedArray, 0, arrayLength - rotations);
		System.arraycopy(array, 0, rotatedArray, arrayLength - rotations, rotations);
		return rotatedArray;
	}

	public static void main(String[] args) {
		createArray();
		printOutput(rotLeft());
	}

	public static void createArray() {
		Scanner scanner = new Scanner(System.in);
		String[] elementsAndRotations = scanner.nextLine().split(" ");
		array = new int[Integer.parseInt(elementsAndRotations[0])];
		rotations = Integer.parseInt(elementsAndRotations[1]);
		String[] aItems = scanner.nextLine().split(" ");
		for(int i = 0; i < array.length; i++)
			array[i] = Integer.parseInt(aItems[i]);
		scanner.close();
	}

	public static void printOutput(int[] result) {
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {
			for(int i = 0; i < result.length; i++) {
				bufferedWriter.write(String.valueOf(result[i]));
				if(i != result.length - 1)
					bufferedWriter.write(" ");
			}
			bufferedWriter.newLine();
		} catch(IOException e) {
			System.out.println("IOException");
		}
	}
}
