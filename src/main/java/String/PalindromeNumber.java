
package String;

import java.util.*;

public class PalindromeNumber {

    public static void main(String[] args) {
        int n1 = 121, n2 = -121, n3 = 10;
        System.out.println("Result: " + numsIsPal(n1));//true
        //System.out.println("Result: " + numsIsPal(n2));//false -121 : 121-
        //System.out.println("Result: " + numsIsPal(n3));//false 10 : 01
    }
    
    static boolean numsIsPal(int n) {
        //-121
        if (n == 0) return true;
        if (n < 0 || n % 10 == 0) return false;
        
        int reversed_int = 0;//1
        while (n > reversed_int) {
            int reminder = n % 10; //121%10 = 1, 12%10=2,
            n /= 10; //121/10=12, 12/10=1
            reversed_int = (reversed_int * 10) + reminder;//1
        } 
        
        if (n == reversed_int || n == reversed_int / 10) {
            return true;
        } else {
            return false;
        }
        
    }
}
