package x11.Arrays2D;

import java.util.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String regex = "(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?";
		String[] rowNumbers;
		int[][] twoDimensionsArray = new int[6][6];
		for(int i = 0; i < 6; i++) {
			rowNumbers = scanner.nextLine().split(" ");
			scanner.skip(regex);
			for(int j = 0; j < 6; j++)
				twoDimensionsArray[i][j] = Integer.parseInt(rowNumbers[j]);
		}
		System.out.println(hourglassSum(twoDimensionsArray));
		scanner.close();
	}

  public static int hourglassSum(int[][] array) {
    int sum = -63;
    int tempSum = 0;
    for(int i = 0; i < 4; i++) {
      for(int j = 0; j < 4; j++) {
        tempSum = array[i][j]
          + array[i][j + 1]
          + array[i][j + 2]
          + array[i + 1][j + 1]
          + array[i + 2][j]
          + array[i + 2][j + 1]
          + array[i + 2][j + 2];
        sum = tempSum > sum ? tempSum : sum;
      }
    }
    return sum;
  }
}