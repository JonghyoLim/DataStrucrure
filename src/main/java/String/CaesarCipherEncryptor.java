
package String;

import java.util.*;

public class CaesarCipherEncryptor {
    
    public static String caesarCypherEncryptor(String str, int key) {
        //a:97..z:122
        //xyz key=4, --> bcd
        char[] newLetters = new char[str.length()];//3
        int newKey = key % 26;//4%26= 4
        
        for (int i = 0; i < str.length(); i++) {
            newLetters[i] = getNewLetter(str.charAt(i), newKey);
        }
        return new String(newLetters);
        
    }
    
    public static char getNewLetter(char letter, int key){
        int newLetterCode = letter + key; //x:120+4, y:121+4 z:122+4
        //96 + (124 % 122) = 98 = b
        return (newLetterCode <= 122) ? (char) newLetterCode : (char) (96 + newLetterCode % 122);
    }
    
    public static void main(String[] args) {
      
        System.out.println(caesarCypherEncryptor("xyz", 4));
    }
    
}
