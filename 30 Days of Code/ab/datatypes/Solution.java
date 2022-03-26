package ab.datatypes;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
  private static int baseInteger = 4;
  private static double baseDouble = 4.0;
  private static String baseText = "HackerRank ";
  private static final String REGEX = "(\r\n|[\n\r\u2028\u0085])?";

  public static void main(String[] args) {
    try (var sc = new Scanner(in)) {
      out.println(sum(sc.nextInt()));
      out.println(sum(sc.nextDouble()));
      sc.skip(REGEX);
      out.println(concatenate(sc.nextLine()));
    }
  }

  public static int sum(int input) {
    return baseInteger + input;
  }

  public static double sum(double input) {
    return baseDouble + input;
  }

  public static String concatenate(String input) {
    return baseText + input;
  }
}
