/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.*;
public class veryBigSum {

    static long aVeryBigSum(long[] ar){
        long sum = 0;
        
        for(int i = 0; i < ar.length; i++){        
            sum += ar[i];
        }
        return sum;
        
    }
    
    
    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Enter a size of array: ");
        int n = in.nextInt();
        
        System.out.println("Enter a " + n + " of each number: ");
        long[] ar = new long[n];
        for(int i=0; i<n; i++){
            ar[i] = in.nextInt();
        }
        
        long result = aVeryBigSum(ar);
        System.out.println(" Big Sum:" + result);
        
    }
    
}
