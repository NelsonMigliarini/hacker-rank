package x01.DataTypes;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
  private static Scanner scanner;
  private static int firstInt = 4;
  private static double firstDouble = 4.0;
  private static String firstString = "HackerRank ";

  public static void main(String[] args) {
    scanner = new Scanner(System.in);
    System.out.println(getString());
    scanner.close();
  }

  public static String getString() {
    String regex = "(\r\n|[\n\r\u2028\u2029\u0085])?";
    StringBuilder string = new StringBuilder();
    string.append(firstInt + scanner.nextInt() + "\n");
    string.append(firstDouble + scanner.nextDouble() + "\n");
    scanner.skip(regex);
    string.append(firstString + scanner.nextLine());
    return string.toString();
  }
}
