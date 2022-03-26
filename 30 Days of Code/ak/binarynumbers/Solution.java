package ak.binarynumbers;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
  public static void main(String[] args) {
    System.out.println(getBinaryCalculation(getInformation()));
  }

  public static int getInformation() {
    return new Scanner(System.in).nextInt();
  }

  public static int getBinaryCalculation(int decimalNumber) {
    int sum = 0;
    int temporalSum = 0;
    while(decimalNumber > 0) {
      if(decimalNumber % 2 == 1) {
        temporalSum++;
        if(temporalSum > sum) {
          sum = temporalSum;
        }
      } else {
        temporalSum = 0;
      }
      decimalNumber /= 2;
    }
    return sum;
  }
}
