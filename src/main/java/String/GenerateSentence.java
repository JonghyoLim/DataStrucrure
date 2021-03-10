
package String;

import java.util.*;

public class GenerateSentence {
    
    static boolean generateSentence(String letters, String sentence) {
        HashMap<Character, Integer> letterCounts = new HashMap<Character, Integer>();
        
        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            letterCounts.put(letter, letterCounts.getOrDefault(letter, 0) + 1);
        }
        
        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);
            if (!letterCounts.containsKey(letter) || letterCounts.get(letter) == 0) {
                return false;
            }
            letterCounts.put(letter, letterCounts.get(letter) - 1);
        }
        
        return true;
    }
    
    
    public static void main(String[] args) {
        
        String letters = "helloworldO"; // h:1, e:1, l:3, o:2, w:1, r:1, d:1, O:1 = 11
        String sentence = "hello wOrld";// h:1, e:1, l:3, o:2, w:1, r:1, d:1 = 10
        
        System.out.println("Result: " + generateSentence(letters, sentence)); //false
        System.out.println("Result: " + generateSentence("helloworld ", "hello world")); //true
        System.out.println("Result: " + generateSentence("&*&you^a%^&8766 _=-09     docanCMakemthisdocument", "Can you make this document &")); //true
        System.out.println("Result: " + generateSentence("abcabcabcacbcdaabctytyty", "bacaccadac"));//true
        System.out.println("Result: " + generateSentence("estssa", "testing"));//false
        System.out.println("Result: " + generateSentence("aheaolabbhbl", "hello"));//false
        System.out.println("Result: " + generateSentence("a", "a"));//true
        System.out.println("Result: " + generateSentence("A", "a"));//false
        System.out.println("Result: " + generateSentence("     ", "     "));//true
       
    }
    
    
}
