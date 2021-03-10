
package Array;

import java.util.*;

public class SortedSquaredArray {
    
    static int[] sortedSquaredArray(int[] array) {
        int[] sortedSquared = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            sortedSquared[i] = (int)Math.pow(value, 2); //Math.pow is Double
        }
        Arrays.sort(sortedSquared);
        return sortedSquared;
        
    }
   
    public static void main(String[] args) {
       int[] array = {-3, -2, -4};
       //result = [1, 4, 9, 25, 36, 64, 81]
        System.out.println("Sorted Squared number Array:");
        System.out.println(Arrays.toString(sortedSquaredArray(array)));
    }
    
}
