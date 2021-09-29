package x03.DataStructures.x08.Hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<String> hashSet = new HashSet<>();
		int size = scanner.nextInt();
		for(int i = 0; i < size; i++) {
			hashSet.add(scanner.next() + " " + scanner.next());
			System.out.println(hashSet.size());
		}
	}
}