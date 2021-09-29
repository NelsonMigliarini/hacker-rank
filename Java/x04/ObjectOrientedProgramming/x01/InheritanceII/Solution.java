package x04.ObjectOrientedProgramming.x01.InheritanceII;

/**
 * @author Nelson Migliarini
 */
class Arithmetic {
	protected int add(int numberA, int numberB) {
		return numberA + numberB;
	}
}

class Adder extends Arithmetic {}

public class Solution {
	public static void main(String[] args) {
		Adder a = new Adder();
		System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
		System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
	}
}