
package String;

import java.util.*;

public class LengthOfLongestSubstring {


    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbbbb";
        String s3 = "pwwkew";
        System.out.println(s1 + ": " + lengthOfLongestSubstring(s1));
        System.out.println(s2 + ": " + lengthOfLongestSubstring(s2));
        System.out.println(s3 + ": " + lengthOfLongestSubstring(s3));
    
    }
    
    static int lengthOfLongestSubstring(String s){
        //pointers
        int a_pointer = 0, b_pointer = 0, max = 0;
        HashSet<Character> char_set = new HashSet<Character>();
        
        while (b_pointer < s.length()) {
            if (!char_set.contains(s.charAt(b_pointer))) {
                char_set.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(char_set.size(), max);
            } else  {
                char_set.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }
}
