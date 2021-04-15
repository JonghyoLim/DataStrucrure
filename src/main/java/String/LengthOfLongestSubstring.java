
package String;

import java.util.*;

public class LengthOfLongestSubstring {
    
    static int lengthOfLongestSubstring(String s){
        HashSet<Character> char_set = new HashSet<Character>();
        //pointers
        int a_pointer = 0, b_pointer = 0, max = 0;
        //a b c a b c b b
        while (b_pointer < s.length()) {
            if (!char_set.contains(s.charAt(b_pointer))) {
                char_set.add(s.charAt(b_pointer));//abc- abc 
                b_pointer++;//1,2,3,4
                max = Math.max(char_set.size(), max);//1,2,3
            } else  {
                char_set.remove(s.charAt(a_pointer));//abc,bc- abc,ac,abc
                a_pointer++;//1
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbbbb";
        String s3 = "pwwkew";
        System.out.println(s1 + ": " + lengthOfLongestSubstring(s1));
        System.out.println(s2 + ": " + lengthOfLongestSubstring(s2));
        System.out.println(s3 + ": " + lengthOfLongestSubstring(s3));
    
    }
    

}
