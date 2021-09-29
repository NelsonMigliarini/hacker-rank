package x03.DataStructures.x11.Sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}

	public static void sortStudents(List<Student> students) {
		students.sort(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getFname)
				.thenComparing(Student::getId));
	}
}

public class Solution {
	private static List<Student> studentList = new ArrayList<>();

	public static void main(String[] args) {
		getInformation();
		Student.sortStudents(studentList);
		for(Student students : studentList) {
			System.out.println(students.getFname());
		}
	}

	public static void getInformation() {
		Scanner scanner = new Scanner(System.in);
		int testCases = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < testCases; i++)
			studentList.add(new Student(scanner.nextInt(), scanner.next(), scanner.nextDouble()));
		scanner.close();
	}
}
