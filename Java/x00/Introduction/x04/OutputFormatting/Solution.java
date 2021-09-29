package x00.Introduction.x04.OutputFormatting;

import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.println(String.format("%1$-15s%2$03d", s1, x));
        }
        System.out.println("================================");
    }
}