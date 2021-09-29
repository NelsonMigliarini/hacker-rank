package x03.DataStructures.x03.Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		List<ArrayList<Integer>> arrList = new ArrayList<>(amount);

		for(int i = 0; i < amount; i++) {
			int value = scanner.nextInt();
			arrList.add(new ArrayList<>());
			for(int j = 0; j < value; j++)
				arrList.get(i).add(scanner.nextInt());
		}
		amount = scanner.nextInt();
		for(int i = 0; i < amount; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			if(x <= arrList.size() && y <= arrList.get(x - 1).size())
				System.out.println(arrList.get(x - 1).get(y - 1));
			else
				System.out.println("ERROR!");
		}
		scanner.close();
	}
}