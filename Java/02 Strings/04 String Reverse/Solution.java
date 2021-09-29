import java.io.*;
import java.util.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        StringBuilder reversed = new StringBuilder(A);
        reversed.reverse();

        if (A.compareTo(reversed.toString()) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}