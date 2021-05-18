
package HashMapDictionaries;

import java.util.*;

public class TwoStrings {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

            String s1 = scanner.nextLine(); //hellojava
            String s2 = scanner.nextLine(); //hijavascript
            String result = twoStrings(s1, s2);
            System.out.println("Result: " + result);
            
    }
    
    static String twoStrings(String s1, String s2) {
        HashSet<Character> s1_chars = new HashSet();
        HashSet<Character> s2_chars = new HashSet();
        
        for (int i = 0; i < s1.length(); i++) {
            s1_chars.add(s1.charAt(i)); //[h e l o j a v]
        }

        for (int i = 0; i < s2.length(); i++) {
            s2_chars.add(s2.charAt(i)); //[h i j a v s c r p t]
        }
 
        
        s1_chars.retainAll(s2_chars);// [h j a v] 
        System.out.println("S1: " + s1_chars);
        if (!s1_chars.isEmpty()) {
            return "YES"; //s1 retains [h j a v] 
        } else {
            return "NO";
        }
    }
    
}
