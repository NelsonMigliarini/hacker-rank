package af.loops;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {

  public static void main(String[] args) {
    try (var sc = new Scanner(in)) {
      var value = sc.nextInt();
      for (var i = 1; i < 11; i++)
        getMultiplication(value, i);
    }
  }

  private static void getMultiplication(int firstValue, int secondValue) {
    out.println(String.format("%s x %s = %s", firstValue, secondValue, firstValue * secondValue));
  }
}
