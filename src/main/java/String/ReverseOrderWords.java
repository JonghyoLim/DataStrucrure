
package String;

import java.util.*;

public class ReverseOrderWords {
    
    //pssing String
    static String reverseWords(String sentence) {
      
        String s[] = sentence.split(" ");
        String result = "";
        for (int i = s.length - 1; i >= 0; i--) {
            result += s[i] + " ";
        }
        return result;
        
    }
    
    
    //Passing array
    static String reverseWords_passing_array(String[] s) {
        
        String result = "";
        for (int i = s.length - 1; i >= 0; i--) {
            result += s[i] + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        
        System.out.println(reverseWords("I love coding very much"));
                 
        System.out.println(reverseWords_passing_array("I love coding".split(" ")));
        
       
//        String sentence[] = "I love coding".split(" ");     
//        String reverse = "";
//        
//        for (int i = sentence.length - 1; i >=0; i--) {
//            reverse += sentence[i] + " ";
//        }
//        
//        System.out.println(reverse.substring(0, reverse.length() - 0));
//        System.out.println(reverse);

    }
    
}
