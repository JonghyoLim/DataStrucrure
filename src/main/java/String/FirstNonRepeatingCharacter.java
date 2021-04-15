
package String;

import java.util.*;

public class FirstNonRepeatingCharacter {
    
    public static char firstNonRepeatingCharacter(String str){
        HashMap<Character, Integer> char_counts = new HashMap();
        // aaabccc //a:3 b:1 c:3
        // abcbad  //a:2 b:2 c:1 d:1
        // abacabad //a:4 b:2 c:1 d:1 --> c
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (char_counts.containsKey(c)) {
                char_counts.put(c, char_counts.get(c) + 1);
            } else {
                char_counts.put(c, 1);
            }
        }
        
        //Find first HashMap value is : 1 then return char
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (char_counts.get(c) == 1) return c;
        }
        return '_'; // if not found non of repeating
    }

    public static void main(String[] args) {
       
        System.out.println(firstNonRepeatingCharacter("aaacccpddddd"));
    }
    
}
