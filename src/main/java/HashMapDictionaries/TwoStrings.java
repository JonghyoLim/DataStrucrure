
package HashMapDictionaries;

import java.util.*;

public class TwoStrings {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < q; i++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            String result = twoStrings(s1, s2);
            System.out.println("Result: " + result);
        }
    }
    
    static String twoStrings(String s1, String s2) {
        HashSet<Character> s1_chars = new HashSet();
        HashSet<Character> s2_chars = new HashSet();
        
        for (int i = 0; i < s1.length(); i++) {
            s1_chars.add(s1.charAt(i)); //h i
        }
        for (int i = 0; i < s2.length(); i++) {
            s2_chars.add(s2.charAt(i)); //e h i
        }
        
        s1_chars.retainAll(s2_chars);//s1 only has 'h'
        if (!s1_chars.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
    
}
