import java.io.*;
import java.util.*;

/**
 * @author Nelson Migliarini
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String a = s.trim();
        
        if(!a.equals("")) {
            String[] split = a.split("[ !,?._'@]+");      
            System.out.println(split.length);
            for(String string : split)
                System.out.println(string);  
        } else {
            System.out.println(0); 
        }
    }
}