
package Array;

import java.util.*;

public class ArrayMaxConsecutiveSum2 {
    
    public static void main(String[] args) {
       //Kadanes Algorithm
       // a = [-2, 2, 5, -11, 6] == 7 at least contains 1 elment 
       //max_sum = interger.MIN_VALUE , current_sum
       //int[] array = {-2, 2, 5, -11, 6};
       //int[] array = {-7, -1, 10, 11, -3};
       //int[] array = {3, -4, 21, -18, 15};
       int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Max Consecutive sum: " +arrayMaxConsecutiveSum2(array));
    }
    
    static int arrayMaxConsecutiveSum2(int[] arr) {
        int max_sum = arr[0]; // -2
        int current_sum = max_sum; // -2          
        for (int i = 1; i < arr.length; i++) {
            current_sum = Math.max(arr[i] + current_sum, arr[i]); // -3 4 3 1 2 7 4
            max_sum = Math.max(current_sum, max_sum); //-2 4 4 4 4 7 7
        }
        return max_sum; //21
    }
    
    
}
