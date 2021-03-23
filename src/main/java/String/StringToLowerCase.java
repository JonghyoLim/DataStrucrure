
package String;

import java.util.*;

public class StringToLowerCase {

    public static void main(String[] args) {
       
        System.out.println("Result: " + toLowerCase("PLANET"));
    }
    
    static String toLowerCase(String s){
        String result = "";
        for (char c : s.toCharArray()){
            if (Character.isUpperCase(c)){
                result += (char)(c + 32); // A:65 a:97
            }
        }
        return result;
    }
}
