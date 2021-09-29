import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
    
    static boolean isAnagram(String a, String b) {
        if(a.length() == b.length())
            return sorter(a).equalsIgnoreCase(sorter(b));
        else 
            return false;     
    }

    public static String sorter(String string) {
        char temp[] = string.toLowerCase().toCharArray();
        java.util.Arrays.sort(temp);
        return new String(temp);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}