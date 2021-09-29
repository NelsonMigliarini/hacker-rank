package x01.WarmUpChallenges.x01.SockMerchant;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int[] ar = new int[n];
		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for(int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		bufferedWriter.close();
		scanner.close();
	}

	static int sockMerchant(int n, int[] ar) {
		int[] pairedSocks = new int[n];
		HashMap<Integer, MutableInt> hashSocks = new HashMap<Integer, MutableInt>();
		int counter = 0;
		int socksCounter = 0;
		for(int i = 0; i < n; i++) {
			MutableInt socks = hashSocks.get(ar[i]);
			if(socks == null) {
				hashSocks.put(ar[i], new MutableInt());
				pairedSocks[counter] = ar[i];
				counter++;
			} else {
				socks.increment();
			}
		}
		for(int i = 0; i < counter; i++) {
			socksCounter = socksCounter + hashSocks.get(pairedSocks[i]).get() / 2;
		}
		return socksCounter;
	}
}

class MutableInt {
	int value = 1;

	public void increment() {
		++value;
	}

	public int get() {
		return value;
	}
}
