import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String temporal;

        for (int i = 0; i <= s.length() - k; i++) {
            temporal = s.substring(i, i + k);
            if (i == 0) {
                smallest = temporal;
                largest = temporal;
            } else {
                if (temporal.compareTo(smallest) < 0) {
                    smallest = temporal;
                }
                if (temporal.compareTo(largest) > 0) {
                    largest = temporal;
                }
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}