
package String;

import java.util.*;

public class LongestConsecutiveChar {
    //current 'B'
    //current_count 1
    //prev_char 'A'
    //max_char  'A'
    //max_count 2
    public static HashMap<Character, Integer> longestConsChar(String str){
        //create empty HashMap
        HashMap<Character, Integer> lcChar = new HashMap<Character, Integer>();
        int max_count = 0, current_count = 0;
        char current_char = ' ', prev_char = ' ', max_char = ' ';
        for (int i = 0; i < str.length(); i++) {
            current_char = str.charAt(i); 
            if (prev_char == current_char) current_count += 1;
            else current_count = 1;
            
            if (current_count > max_count){
                max_count = current_count;
                max_char = current_char;
            }
            prev_char = current_char;
        }
        lcChar.put(max_char, max_count); 
        return lcChar; // {'B' : 3}
    }  

    public static void main(String[] args) {
       
        String str= "ABCCCCBCDDBBBEA";
        System.out.println("Result: " + longestConsChar(str)); //{C=4}
    }
    
}
