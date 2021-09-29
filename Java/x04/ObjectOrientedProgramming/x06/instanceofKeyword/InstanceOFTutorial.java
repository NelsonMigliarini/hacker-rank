package x04.ObjectOrientedProgramming.x06.instanceofKeyword;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
class Student {
}

class Rockstar {
}

class Hacker {
}

public class InstanceOFTutorial {

	static String count(ArrayList<Object> mylist) {
		int a = 0;
		int b = 0;
		int c = 0;
		for(int i = 0; i < mylist.size(); i++) {
			Object element = mylist.get(i);
			if(element instanceof Student)
				a++;
			if(element instanceof Rockstar)
				b++;
			if(element instanceof Hacker)
				c++;
		}
		return Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
	}

	public static void main(String[] args) {
		ArrayList<Object> mylist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	
		for(int i = 0; i < t; i++) {
			String s = sc.next();
			if(s.equals("Student"))
				mylist.add(new Student());
			if(s.equals("Rockstar"))
				mylist.add(new Rockstar());
			if(s.equals("Hacker"))
				mylist.add(new Hacker());
		}
		System.out.println(count(mylist));
	}
}
