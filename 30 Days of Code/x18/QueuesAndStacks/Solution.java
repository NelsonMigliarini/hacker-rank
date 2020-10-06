package x18.QueuesAndStacks;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	private static Queue<Character> queue = new LinkedList<>();
	private static Deque<Character> deque = new LinkedList<>();
	private static String word;
	private static char[] wordInChars;
	private static boolean isPalindrome = true;

	public static void main(String[] args) {
		getInformation();
		fillLists();
		printOutocome();
	}

	public static void getInformation() {
		word = new Scanner(System.in).nextLine();
		wordInChars = word.toCharArray();
	}

	public static void fillLists() {
		for(char letter : wordInChars) {
			pushCharacter(letter);
			enqueueCharacter(letter);
		}
	}

	public static void palindromeWorker() {
		for(int i = 0; i < wordInChars.length / 2; i++) {
			if(popCharacter() != dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}
	}

	private static void printOutocome() {
		System.out.println("The word, " + word + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}

	public static void pushCharacter(char c) {
		deque.push(c);
	}

	public static void enqueueCharacter(char c) {
		queue.add(c);
	}

	public static char popCharacter() {
		return deque.pop();
	}

	public static char dequeueCharacter() {
		return queue.poll();
	}
}