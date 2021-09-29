package x03.DataStructures.x12.Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static Deque<Integer> deque = new ArrayDeque<>();
	private static HashSet<Integer> set = new HashSet<>();
	private static int subArrayLength;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int maxUniques = 0;
		int amount = scanner.nextInt();
		subArrayLength = scanner.nextInt();
		for(int i = 0; i < amount; i++) {
			int tempUniques = subArraysWorker(scanner.nextInt());
			if(maxUniques < tempUniques)
				maxUniques = tempUniques;
			if(maxUniques == subArrayLength)
				break;
		}
		System.out.println(maxUniques);
		scanner.close();
	}

	public static int subArraysWorker(int number) {
		int tempUniques = 0;
		deque.add(number);
		set.add(number);
		if(deque.size() == subArrayLength) {
			tempUniques = set.size();
			int deleted = deque.remove();
			if(!deque.contains(deleted))
				set.remove(deleted);
		}
		return tempUniques;
	}
}
