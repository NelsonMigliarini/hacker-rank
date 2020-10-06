package x25.RunningTimeAndComplexity;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cant = scanner.nextInt();
		for(int i = 0; i < cant; i++)
			System.out.println(isPrime(scanner.nextInt()));
		scanner.close();
	}

	public static String isPrime(int n) {
		if(n == 2)
			return "Prime";
		else if(n == 1 || (n & 1) == 0)
			return "Not prime";
		for(int i = 3; i <= Math.sqrt(n); i += 2)
			if(n % i == 0)
				return "Not prime";
		return "Prime";
	}
}