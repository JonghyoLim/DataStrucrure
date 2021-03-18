
package Array;

import java.util.*;

public class FirstDuplicate {

    public static void main(String[] args) {
        
        int[] a = {2, 1, 3, 5, 3, 2}; //3
        //int[] a = {2, 2}; //2
        //int[] a = {2, 4, 3, 5, 1}; // -1
        //int[] a = {1, 2, 1, 2, 3, 3}; // 1        
        //int[] a = {2, 1, 3, 5, 3, 2}; // 3 
        
        System.out.println("First Dublplicate num: " + firstDuplicateNum(a));
    }
    
    static int firstDuplicateNum(int[] a) {
        int num = 0;
        HashSet<Integer> findDuplicate = new HashSet<Integer>();
        
        for (int i = 0; i < a.length; i++) {
            if (findDuplicate.contains(a[i])) {
                return a[i];
            } else {
                findDuplicate.add(a[i]);
            }         
        }
        return -1;
    }
    
}
