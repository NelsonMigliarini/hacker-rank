package ae.classvsinstance;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {

  public static void main(String[] args) {
    try (var sc = new Scanner(in)) {
      var testCases = sc.nextInt();
      for (var i = 0; i < testCases; i++)
        personWorker(sc);
    }
  }

  private static void personWorker(Scanner sc) {
    var person = new Person(sc.nextInt());
    person.amIOld();
    for (var j = 0; j < 3; j++)
      person.yearPasses();
    person.amIOld();
    out.println();
  }
}

class Person {
  int age;

  public Person(int initialAge) {
    if (initialAge < 0) {
      out.println("Age is not valid, setting age to 0.");
      age = 0;
    } else
      age = initialAge;
  }

  public void yearPasses() {
    age++;
  }

  public void amIOld() {
    if (age < 13)
      out.println("You are young.");
    else if (age < 18)
      out.println("You are a teenager.");
    else
      out.println("You are old.");
  }
}
