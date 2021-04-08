
package String;

import java.util.*;

public class RepeatingString {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        //Find letter 'a's in the first n letters
        String s = scanner.nextLine();
        long n = scanner.nextLong();
        System.out.println("Repeating 'a' character: " + repeatedString(s, n));
    }
    
    static long repeatedString(String s, long n) {
        //a b c a c | a b c a c | a b c a = 6
        long stringRepeat = n / s.length(); //14/5 = 2;
        int reminder =(int)(n % s.length());//14%5 = 4
        long found = 0;
        
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                found++;
            }
        }
        
        Long total = found * stringRepeat;
        
        if (reminder == 0) return total;
        else {
            String parts = s.substring(0, reminder);
            for (char c : parts.toCharArray()){
                if (c == 'a') total++;
            }
        }
        return total;
    }
}
