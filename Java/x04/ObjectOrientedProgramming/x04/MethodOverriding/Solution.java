package x04.ObjectOrientedProgramming.x04.MethodOverriding;

/**
 * @author Nelson Migliarini
 */
class Sports {
	static String string = "Generic Sports";

	String getName() {
		return string;
	}

	void getNumberOfTeamMembers() {
		System.out.println("Each team has n players in " + getName());
	}
}

class Soccer extends Sports {
	
	@Override
	String getName() {
		return "Soccer Class";
	}

	@Override
	void getNumberOfTeamMembers() {
		System.out.println("Each team has 11 players in " + getName());
	}
}

public class Solution {

	public static void main(String[] args) {
		Sports c1 = new Sports();
		Soccer c2 = new Soccer();
		System.out.println(c1.getName());
		c1.getNumberOfTeamMembers();
		System.out.println(c2.getName());
		c2.getNumberOfTeamMembers();
	}
}