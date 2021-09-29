package x03.DataStructures.x14.PriorityQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
class Student {
	private int id;
	private String name;
	private double cgpa;

	public Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCGPA() {
		return cgpa;
	}

	public String toString() {
		return this.getCGPA() + " " + this.getName() + " " + this.getID();
	}
}

class Priorities {
	private static PriorityQueue<Student> students = new PriorityQueue<>(
			Comparator.comparing(Student::getCGPA)
			.reversed()
			.thenComparing(Student::getName)
			.thenComparing(Student::getID));

	public List<Student> getStudents(List<String> events) {
		for(String event : events) {
			String[] elements = event.split(" ");
			switch(elements[0]) {
				case "ENTER":
					addStudent(elements);
					break;
				case "SERVED":
					serveStudent();
					break;
				default:
					break;
			}
		}

		List<Student> studentsList = new ArrayList<>(students.size());
		int size = students.size();
		for(int i = 0; i < size; i++) {
			studentsList.add(students.poll());
		}
		return studentsList;
	}

	private static void addStudent(String[] elements) {
		String name = elements[1];
		double cgpa = Double.parseDouble(elements[2]);
		int id = Integer.parseInt(elements[3]);
		students.add(new Student(id, name, cgpa));
	}

	private static void serveStudent() {
		students.poll();
	}
}

public class Solution {
	private static final Scanner scan = new Scanner(System.in);
	private static final Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();
		while(totalEvents-- != 0)
			events.add(scan.nextLine());
		List<Student> students = priorities.getStudents(events);
		if(students.isEmpty())
			System.out.println("EMPTY");
		else
			for(Student student : students)
				System.out.println(student.getName());
	}
}
