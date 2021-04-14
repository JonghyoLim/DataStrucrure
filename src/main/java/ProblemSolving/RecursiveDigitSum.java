
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
        //n = '148', k = 4 
        //1+4+8= f(13) = 4 * 3 = 12
        // f(12)= 2 + f(1)// 1 + f(0) = 3
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Integer.parseInt(n.charAt(i) + ""); //1+4+8=13
        }
        
        int final_sum = recursiveHelper(sum) * k; //f(13) 4*3 = 12
        return (final_sum > 10) ? recursiveHelper(final_sum) : final_sum;
    }//end superDigit method
    
    private static int recursiveHelper(int n) {
        //n =13
        if (n < 10) return n;
        return n % 10 + recursiveHelper(n/10);//3+f(1)// 1+f(0) return 4        
    }
    
}
