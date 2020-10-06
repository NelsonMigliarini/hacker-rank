package x12.Inheritance;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}
}

class Student extends Person {
	private int[] testScores;

	public Student(String firstName, String lastName, int id, int[] testScores) {
		super(firstName, lastName, id);
		this.testScores = testScores;
	}

	public char calculate() {
		int totalScore = 0;
		int averageGrade;
		for(int score : testScores)
			totalScore = totalScore + score;
		averageGrade = totalScore / testScores.length;
		if(averageGrade >= 90)
			return 'O';
		else if(averageGrade >= 80)
			return 'E';
		else if(averageGrade >= 70)
			return 'A';
		else if(averageGrade >= 55)
			return 'P';
		else if(averageGrade >= 40)
			return 'D';
		else
			return 'T';
	}
}

class Solution {
	static String firstName;
	static String lastName;
	static int id;
	static int numScores;
	static int[] testScores;

	public static void main(String[] args) {
		getInformation();
		Student student = new Student(firstName, lastName, id, testScores);
		student.printPerson();
		System.out.println("Grade: " + student.calculate());
	}

	public static void getInformation() {
		Scanner scan = new Scanner(System.in);
		firstName = scan.next();
		lastName = scan.next();
		id = scan.nextInt();
		numScores = scan.nextInt();
		testScores = new int[numScores];
		for(int i = 0; i < numScores; i++)
			testScores[i] = scan.nextInt();
		scan.close();
	}
}