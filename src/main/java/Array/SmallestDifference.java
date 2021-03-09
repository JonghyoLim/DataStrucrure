
package Array;

import java.util.*;

public class SmallestDifference {
    
    public static int[]  smallestDifference(int[] a1, int[] a2){
        
        Arrays.sort(a1);
        Arrays.sort(a2);
        int idxOne = 0; int idxTwo = 0;
        int smallest = Integer.MAX_VALUE;
        int current = Integer.MAX_VALUE;
        int[] smallestPair = new int[2];
        
        // a1 = [-1,3, 5, 10, 20,28]
        //a2 = [15, 17, 26, 134, 135]
        while (idxOne < a1.length && idxTwo < a2.length){
            int firstNum = a1[idxOne];
            int secondNum = a2[idxTwo];
            if (firstNum < secondNum) {
                current = secondNum - firstNum; 
                idxOne++;//28
            } else if (firstNum > secondNum) {
                current = firstNum - secondNum; 
                idxTwo++; //26
            } else {
                return new int[] {firstNum, secondNum};
            }
            if (smallest > current) {
                smallest = current;
                smallestPair = new int[] {firstNum, secondNum};
            }
        }
        
        
        return smallestPair;
    }
  
    public static void main(String[] args) {
        
        int[] arrayOne = {-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = {26, 134, 135, 15, 17};
        int[] sp = new int[2];
        sp = smallestDifference(arrayOne, arrayTwo);
        System.out.print(Arrays.toString(sp) + " "); 
    }
    
}
