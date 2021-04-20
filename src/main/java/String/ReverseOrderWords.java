
package String;

import java.util.*;

public class ReverseOrderWords {
    
    static String reversedString(String myName) {
        String result = "";
        for (int i = myName.length()-1; i>=0; i--){
            result += myName.charAt(i);
        }
        return result;
    }
    
    //passing String
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
    
    static String reverseWordsinString(String s) {
        ArrayList<String> words = new ArrayList<String>();
        int startIndex = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            
            if (letter == ' ') {
                words.add(s.substring(startIndex, i));
                startIndex = i;
            } else if (s.charAt(startIndex) == ' '){
                words.add(" ");
                startIndex = i;
            }//end else if
        }//end for
        
        words.add(s.substring(startIndex));
        
        Collections.reverse(words);
        return String.join("", words);
        
    }

    public static void main(String[] args) {
//        System.out.println(reversedString("jonghyolim"));
//        System.out.println(reverseWords("words, separated, by, commas"));
//            System.out.println(reverseWords("1 12 23 34 56"));
//        System.out.println(reverseWords("..H,, hello 678"));
                 
        System.out.println(reverseWords_passing_array("I love coding".split(" ")));
        
//        System.out.println(reverseWordsinString("I love coding very much"));
       
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
