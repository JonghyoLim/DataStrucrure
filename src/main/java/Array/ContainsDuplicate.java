
package Array;

import java.util.*;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] a1 = {1,2,3,1};
        int[] a2 = {1,2,3,4};
        int[] a3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println("Array 1: " + containsDuplicate(a1));//t
        System.out.println("Array 2: " + containsDuplicate(a2));//f
        System.out.println("Array 3: " + containsDuplicate(a3));//t
    }
    
    static boolean containsDuplicate(int[] arr) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            if (numbers.contains(arr[i])) 
                return true;
            numbers.add(arr[i]);
        }
        return false;
    }
    
}
