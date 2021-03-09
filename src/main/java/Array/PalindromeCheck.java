
package Array;

import java.util.*;

public class PalindromeCheck {
    
    public static boolean isPalindromeV1(String str) {
        
        String reversedString = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        System.out.println(reversedString);
        return str.equals(reversedString);
    }
    
    public static boolean isPalindromeV2(String str) {
        int leftIdx = 0, rightIdx = str.length() - 1;
        
        while (leftIdx < rightIdx) {
            if(str.charAt(leftIdx) != str.charAt(rightIdx)) {return false;}
            leftIdx++; rightIdx--;
        }
        return true;
    }
    
    public static boolean isPalindromeV3(String str, int i) {
        int j = str.length() - 1 - i;
        return i >= j ? true : str.charAt(i) == str.charAt(j) && isPalindromeV3(str, i + 1);
         

    }
    public static boolean isPalindromeV4(String str) {
       
        return recursiveChecker(str, 0);
         

    }
    
    public static boolean recursiveChecker(String str, int i) {
        int j = str.length() - 1 - i;
        return i >= j ? true : str.charAt(i) == str.charAt(j) && recursiveChecker(str, i + 1);
    }

    public static void main(String[] args) {

        String string = "madam";
        String string1 = "hoaog";
        
        System.out.println(isPalindromeV1(string));
        System.out.println(isPalindromeV2(string));
        System.out.println(isPalindromeV3(string, 0));
        System.out.println(isPalindromeV4(string1));
        
    }
    
}
