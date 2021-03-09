
package Array;


import java.util.*;

public class SimpleArraySum {

    static int simpleArraySum (int[] ar) {
        int sum = 0;
        for(int i = 0; i < ar.length; i++){
             sum += ar[i];
        }
        return sum;
    }
    
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Enter a size of array: ");
        int n = in.nextInt();
        
        System.out.println("Enter a " + n + " of each number: ");
        int[] ar = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = in.nextInt();
        }
         
       
        int result = simpleArraySum(ar);
        System.out.println(" Sum:" + result);
    }
    
}
