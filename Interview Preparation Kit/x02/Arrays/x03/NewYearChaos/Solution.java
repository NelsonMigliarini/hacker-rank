package x02.Arrays.x03.NewYearChaos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		racesWorker(scanner.nextInt());
		scanner.close();
	}

	public static void racesWorker(int races) {
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {
			for(int i = 0; i < races; i++) {
				minimumBribes(getRacePositionsArray(), bufferedWriter);
			}
		} catch(IOException e) {
			System.out.println("IOException");
		}
	}

	public static void minimumBribes(int[] array, BufferedWriter bufferedWriter) throws IOException {
		int bribes = 0;
		boolean chaotic = false;
		int temp;
		for(int i = 0; i < array.length - 1; i++) {
			int tempBribes = 0;
			for(int j = 0; j < array.length; j++) {
				if(array[j] > j + 3) 
					chaotic = true;
				else if(j + 1 < array.length && array[j + 1] < array[j]) {
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
					bribes++;
					tempBribes++;
				}
			}
			if(chaotic || tempBribes == 0)
				break;
		}
		bufferedWriter.write(!chaotic ? String.valueOf(bribes) : "Too chaotic");
		bufferedWriter.newLine();
	}

	private static int[] getRacePositionsArray() {
		String regex = "(\r\n|[\n\r\u2028\u2029\u0085])?";
		int persons = scanner.nextInt();
		int[] array = new int[persons];
		String[] stringPositionsArray = scanner.skip(regex).nextLine().split(" ");
		for(int j = 0; j < persons; j++)
			array[j] = Integer.parseInt(stringPositionsArray[j]);
		return array;
	}
}
