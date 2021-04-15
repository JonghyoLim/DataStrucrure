
package String;

import java.util.*;

public class LongestConsecutiveChar {
    //current_char A,B,C,C,C,B,C,B,A
    //current_count 1,2,3,1,1,1,1
    //max_char  A,B,C
    //max_count O,1,1,1,2,3
    //prev_char A,B,C,C,B,C,B,A
    public static HashMap<Character, Integer> longestConsChar(String s){
        //s = A B C C C B C B A
        HashMap<Character, Integer> longestChar = new HashMap<>();
        int max_count = 0, current_count = 0;
        char current_char = ' ', prev_char = ' ', max_char = ' ';
        for (int i = 0; i < s.length(); i++) {
            current_char = s.charAt(i);//A,B
            if (prev_char == current_char) current_count += 1;
            else current_count = 1;//1,1
            
            if (current_count > max_count){ //1 > 0
                max_char = current_char;//max_char:A
                max_count = current_count;//max_count:1
            }
            prev_char = current_char;//prev_char:A,B,C
        }
        longestChar.put(max_char, max_count);//A=1
        return longestChar; // {C = 3}
    }  

    public static void main(String[] args) {
       
        String str= "ABCCCBCBA";
        System.out.println("Result: " + longestConsChar(str)); //{C=3}
    }
    
}
