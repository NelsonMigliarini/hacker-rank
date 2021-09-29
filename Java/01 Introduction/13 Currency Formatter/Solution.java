import java.util.*;
import java.text.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        System.out.println("US: " + formatter(payment, Locale.US));
        System.out.println("India: " + formatter(payment, new Locale("en", "IN")));
        System.out.println("China: " + formatter(payment, Locale.CHINA));
        System.out.println("France: " + formatter(payment, Locale.FRANCE));
    }

    public static String formatter(double value, Locale local) {
        return NumberFormat.getCurrencyInstance(local).format(value);
    }
}

