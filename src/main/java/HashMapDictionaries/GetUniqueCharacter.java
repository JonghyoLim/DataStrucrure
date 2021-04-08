
package HashMapDictionaries;

import java.util.*;

public class GetUniqueCharacter {

    public static void main(String[] args) {
        System.out.println(getUniqueCharacter("stastics"));
    }
    
    
    public static int getUniqueCharacter(String s) {
    // Write your code here
    //s = "statitics"
    // words = s:2 t:3 a:1 i:2 c:1
    HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>();
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (charCounts.containsKey(c)) {
            charCounts.put(c, charCounts.get(c) + 1);
        }
        else {
            charCounts.put(c, 1);
        }
    }
    
    for (int i = 0; i < s.length(); i++) {
        //check the first unique frequency
        if (charCounts.get(s.charAt(i)) == 1){
            return i + 1;
        }
    }
    
    return -1;
   
    }

}
