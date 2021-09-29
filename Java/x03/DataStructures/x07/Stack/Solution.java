package x03.DataStructures.x07.Stack;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
class Solution {
	private static Scanner scanner;

	public static void main(String[] argh) {
		scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			System.out.println(stackWorker());
		}
		scanner.close();
	}

	private static boolean stackWorker() {
		Deque<Character> deque = new ArrayDeque<>();
		for(char character : scanner.nextLine().toCharArray()) {
			if(character == '(' || character == '{' || character == '[')
				deque.push(character);
			else if(!deque.isEmpty() && (
				(character == ')' && deque.peek() == '(') ||
				(character == '}' && deque.peek() == '{') ||
				(character == ']' && deque.peek() == '['))) 
				deque.pop();
			else if(character == ')' || character == '}' || character == ']') {
				deque.push(character);
				break;
			}
		}
		return deque.isEmpty();
	}
}
