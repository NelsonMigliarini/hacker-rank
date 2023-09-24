import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.Locale.US;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {

  public static void main(String[] args) {
    try (var scanner = new Scanner(in)) {
      scanner.useLocale(US);
      out.println(operate(scanner.nextInt()));
      scanner.nextLine();
      out.println(operate(scanner.nextDouble()));
      scanner.nextLine();
      out.println(operate(scanner.nextLine()));
    }
  }
  
  public static String operate(int value) {
    return Integer.toString(4 + value);
  }
  
  public static String operate(double value) {
    return String.format(US, "%.1f", 4.0 + value);
  }
  
  public static String operate(String value) {
    return "HackerRank " + value;
  }
}
