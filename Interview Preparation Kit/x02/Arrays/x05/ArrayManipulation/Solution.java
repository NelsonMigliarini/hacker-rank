package x02.Arrays.x05.ArrayManipulation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static final Scanner scanner = new Scanner(System.in);
	private static String regex = "(\r\n|[\n\r\u2028\u2029\u0085])?";

	public static void main(String[] args) throws IOException {
		printOutput(arrayManipulation());
		scanner.close();
	}
	
	public static long arrayManipulation() {
		String[] parameters = scanner.nextLine().split(" ");
		int elements = Integer.parseInt(parameters[0]);
		int additions = Integer.parseInt(parameters[1]);
		long maximum = 0;
		long temporal = 0;
		long[] array = new long[elements];
		for(int i = 0; i < additions; i++) {
			int[] queries = Arrays.stream(scanner.skip(regex).nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			array[queries[0] - 1] += queries[2];
			if(queries[1] < elements)
				array[queries[1]] -= queries[2];
		}
		for(int i = 0; i < elements; i++) {
			temporal += array[i];
			if(temporal > maximum)
				maximum = temporal;
		}
		return maximum;
	}

	public static void printOutput(long result) {
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {
			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		} catch(IOException e) {
			System.out.println("IOException");
		}
	}
}
