
package String;

import java.util.*;

public class ReverseInteger {
    
    static int reverseNum(int x) {
        //Integer.MAX_VALUE =  2,147,483,647
        //Integer.MIN_VALUE = -2,147,483,648
        //x = 1,646,324,351
        int result = 0;
        while (x != 0) {
            int lastDigit = x % 10;//1
            int newResult = result * 10 + lastDigit; //1
            if ((newResult - lastDigit) / 10 != result) {
                return 0;
            }
            x /= 10;
            result = newResult;
        }
        return result;//9,646,324,35
    }
    
    public static void main(String[] args) {
        
        //int n = 1,534,236,469; // return 9,646,324,351 = 0
        int n = 1534236469;//1,646,324,351
        System.out.println(reverseNum(n)); //9,646,324,351 = 0
    }

}
