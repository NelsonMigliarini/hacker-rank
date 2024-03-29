import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }
}

class MyRegex {
    String pattern = "^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}"
                        + "(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$";
}