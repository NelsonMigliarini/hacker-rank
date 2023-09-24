import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {

  public static void main(String[] args) {
    generateMessage();
  }

  private static void generateMessage() {
    out.printf("Hello, World.%n%s", getInputString());
  }

  private static String getInputString() {
    try (var scanner = new Scanner(in)) {
      return scanner.nextLine();
    }
  }
}
