
package String;

import java.util.*;

public class ReverseOrderWords {
    
    static String reversedString(String myName) {
        
        //jonghyo lim
        String result = "";
        for (int i = myName.length()-1; i>=0; i--){
            result += myName.charAt(i);
        }
        return result;//mil oyhgnoj
    }
    
    //passing String
    static String reverseWords(String sentence) {
        //vs code
        String s[] = sentence.split(" ");
        String result = "";
        for (int i = s.length - 1; i >= 0; i--) {
            result += s[i] + " ";
        }
        return result;//code vs
        
    }
    
    
    //Passing array
    static String reverseWords_passing_array(String[] s) {
        
        String result = "";
        for (int i = s.length - 1; i >= 0; i--) {
            result += s[i] + " ";
        }
        return result;// coding love I
    }
    
    static String reverseWords_passing_array_SubS(String[] s) {
        
        String reverse = "";
         for (int i = s.length - 1; i >=0; i--) {
            reverse += s[i] + " ";
        }
        
        return (reverse.substring(7, reverse.length() - 0)); //love I
    }
    
    static String reverseWords_ArrayList(String s) {
        ArrayList<String> words = new ArrayList<String>();
        int startIndex = 0;
        //i love coding very much
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
        return String.join("", words);//much very coding love I
        
    }

    public static void main(String[] args) {
        System.out.println(reversedString("jonghyo lim"));
        System.out.println(reverseWords("vs code"));
        System.out.println(reverseWords("1 12 23 34 56"));
        System.out.println(reverseWords("..H,, hello 678"));
        System.out.println(reverseWords_passing_array("I love coding".split(" ")));
        System.out.println(reverseWords_passing_array_SubS("I love coding".split(" ")));          

        System.out.println(reverseWords_ArrayList("I love coding very much"));
       

 

    }
    
}
