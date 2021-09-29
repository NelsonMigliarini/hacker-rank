package x01.WarmUpChallenges.x04.RepeatedString;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
  private static String string;
  private static long characters;

  public static void main(String[] args) throws IOException {
      getInformation();
      printOutput(repeatedString());
  }

  public static void getInformation() {
      Scanner scanner = new Scanner(System.in);
      string = scanner.nextLine();
      characters = scanner.nextLong();
      scanner.close();
  }

  static long repeatedString() {
      long remainder;
      long count = 0;
      long lengthOfString = string.length();
      for(int i = 0; i < lengthOfString; i++)
          if(string.charAt(i) == 'a')
              count++;
      remainder = characters % lengthOfString;
      count = count * (characters - remainder) / lengthOfString;
      if(remainder > 0)
          for(int i = 0; i < remainder; i++)
              if(string.charAt(i) == 'a')
                  count++;
      return count;
  }

  public static void printOutput(long result) {
      try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {
          bufferedWriter.write(String.valueOf(result));
      } catch(IOException e) {
          System.out.println("IOException");
      }
  }
}
