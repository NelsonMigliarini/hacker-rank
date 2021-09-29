package x04.ObjectOrientedProgramming.x00.InheritanceI;

/**
 * @author Nelson Migliarini
 */
class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	protected void fly() {
		System.out.println("I am flying");
	}

	protected void sing() {
		System.out.println("I am singing");
	}
}

public class Solution {

	public static void main(String args[]) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}
}
