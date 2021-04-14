
package ProblemSolving;

import java.util.*;

public class RecursiveDigitSum {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nk = scanner.nextLine().split(" ");
        String n = nk[0];
        int k = Integer.parseInt(nk[1]);
        int result = superDigit(n, k);
        System.out.println("result: " + result);
    }
    
    static int superDigit(String n, int k) {
        //n = '9875', k = 4 then p = 9875 9875 9875 9875
        //9+8+7+5= 29 * 4 = 116
        // f(116)= 6 + f(11)// 1 + f(1) // 1+f(0)
        //1+1+6 = 8 return 8 when only one digit
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Integer.parseInt(n.charAt(i) + ""); //9+8+7+5=29
        }
        sum *=  k;//29*4=116  
        return  recursiveHelper(sum);
        //n = n.chars().mapToLong(Character::getNumericValue).sum() * k + "";//36+32+28+20=116
        //return (n.length() > 1) ? superDigit(n, 1) : Character.getNumericValue(n.charAt(0));
    }//end superDigit method
    
    private static int recursiveHelper(int n) {
        //n =116 // 6+1+1 = 8  
        if (n < 10) return n;     
        return n % 10 + recursiveHelper(n/10);//6+f(11)// 1+f(1) // 1+f(0)        
    }
    
}
