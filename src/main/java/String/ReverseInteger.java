
package String;

import java.util.*;

public class ReverseInteger {

    public static void main(String[] args) {
        
        int n = 1534236469; //9,646,324,351 = 0
        //int n = 1534236461;//1646324351
        System.out.println(reverseNum(n)); //9,646,324,351 = 0
    }
    
    static int reverseNum(int x) {
        //Integer.MAX_VALUE =  2,147,483,647
        //Integer.MIN_VALUE = -2,147,483,648
        int result = 0;//9,646,324,35
        while (x != 0) {
            int lastDigit = x % 10;
            int newResult = result * 10 + lastDigit; //10,646,324,351
            if ((newResult - lastDigit) / 10 != result) {
                return 0;
            }
            x /= 10;
            result = newResult;
        }
        return result;
    }
}
