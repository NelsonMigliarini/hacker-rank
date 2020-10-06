package x04.ClassVsInstance;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
public class Person {
	private int age;

	public Person(int age) {
		if(age >= 0)
			this.age = age;
		else {
			this.age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		for(int i = 0; i < testCases; i++)
			personWorker(scanner.nextInt());
		scanner.close();
	}

	public static void personWorker(int age) {
		Person person = new Person(age);
		person.amIOld();
		for(int j = 0; j < 3; j++)
			person.yearPasses();
		person.amIOld();
		System.out.println();
	}

	public void amIOld() {
		if(this.age < 13)
			System.out.println("You are young.");
		else if(this.age < 18)
			System.out.println("You are a teenager.");
		else
			System.out.println("You are old.");
	}

	public void yearPasses() {
		this.age++;
	}
}
