package x04.ObjectOrientedProgramming.x05.MethodOverriding2;

/**
 * @author Nelson Migliarini
 */
class BiCycle {
	static String string = "a vehicle with pedals.";

	String defineMe() {
		return string;
	}
}

class MotorCycle extends BiCycle {
	@Override
	String defineMe() {
		return "a cycle with an engine.";
	}

	MotorCycle() {
		System.out.println("Hello I am a motorcycle, I am " + defineMe());
		String temp = super.defineMe();
		System.out.println("My ancestor is a cycle who is " + temp);
	}
}

class Solution {
	public static void main(String[] args) {
		new MotorCycle();
	}
}
