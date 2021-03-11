
package String;

import java.util.*;

public class FirstNonRepeatingCharacter {
    
    public static char firstNonRepeatingCharacter(String str){
        HashMap<Character, Integer> char_counts = new HashMap();
        // abacabad  --> c
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (char_counts.containsKey(c)) {
                char_counts.put(c, char_counts.get(c) + 1);
            } else {
                char_counts.put(c, 1);
            }
        }
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (char_counts.get(c) == 1) return c;
        }
        return '_'; // if not found non of repeating
    }

    public static void main(String[] args) {
        // aaabccc   --> b
        // abcbad    --> c
        // abacabad  --> c
        System.out.println(firstNonRepeatingCharacter("aaacccpddddd"));
    }
    
}
