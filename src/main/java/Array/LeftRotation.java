
package Array;

import java.util.*;
public class LeftRotation {


    public static void main(String[] args) {
        
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++){
            a[i] = i + 1;
        }
        int rotated = 4;
        System.out.println("Result: " + Arrays.toString(leftRotate(a, rotated)));
    }
    
    static int[] leftRotate(int[] a, int d){
        int n = a.length;
        int[] newArray = new int[n];
        
        for (int oldI = 0; oldI < n; oldI++){
            int newI = (n + oldI - d) % n;
            newArray[newI] = a[oldI];
        }
        return newArray;
    }
    
    
    
}
