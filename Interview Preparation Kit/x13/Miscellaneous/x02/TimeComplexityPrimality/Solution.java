package x13.Miscellaneous.x02.TimeComplexityPrimality;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static Scanner scanner = new Scanner(System.in);
	private static Set<Integer> primes = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11));

	public static void main(String[] args) throws IOException {
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {
			int amount = scanner.nextInt();
			for(int i = 0; i < amount; i++)
				bufferedWriter.write(primality(scanner.nextInt()) + "\n");
		} catch(IOException e) {
			System.out.println("IOException");
		} finally {
			scanner.close();
		}
	}

	public static String primality(int number) {
		boolean isPrime = true;
		if(!primes.contains(number)) {
			if(number == 1 || (number & 1) == 0)
				isPrime = false;
			for(int i = 3; i <= Math.sqrt(number) && isPrime; i += 2)
				if(number % i == 0) {
					isPrime = false;
					break;
				}
		}
		if(isPrime)
			primes.add(number);
		return isPrime ? "Prime" : "Not prime";
	}
}
