
package String;

import java.util.*;

public class RepeatingString {

    private static final Scanner scanner = new Scanner(System.in);
    
        static long repeatedString(String s, long n) {
        //n=14
        //a b c a c | a b c a c | a b c a = 6
        long stringRepeat = n / s.length(); //14/5 = 2;
        int reminder =(int)(n % s.length());//14%5 = 4
        long found = 0;
        
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                found++;
            }
        }
        
        Long total = found * stringRepeat; //found a: 2*2 = 4
        
        if (reminder == 0) return total;// 4
        else {
            //a b c a c 
            String parts = s.substring(0, reminder);//abcd
            for (char c : parts.toCharArray()){
                if (c == 'a') total++;
            }
        }
        return total;
    }
    
    public static void main(String[] args) {
        //Find letter 'a's in the first n letters
        String s = scanner.nextLine();
        long n = scanner.nextLong();
        System.out.println("Repeating 'a' character: " + repeatedString(s, n));
    }
    

}
