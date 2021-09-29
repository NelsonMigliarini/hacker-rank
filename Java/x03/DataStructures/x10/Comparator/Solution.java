package x03.DataStructures.x10.Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
class Checker implements Comparator<Player> {

	@Override
	public int compare(Player playerA, Player playerB) {
		if(playerA.score == playerB.score)
			return playerA.name.compareTo(playerB.name);
		else
			return playerB.score - playerA.score;
	}
}

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		Player[] player = new Player[amount];
		Checker checker = new Checker();
		for(int i = 0; i < amount; i++)
			player[i] = new Player(scanner.next(), scanner.nextInt());
		scanner.close();
		Arrays.sort(player, checker);
		for(int i = 0; i < player.length; i++)
			System.out.printf("%s %s%n", player[i].name, player[i].score);
	}
}
