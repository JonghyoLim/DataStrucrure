
package Array;

import java.util.*;

public class ArrayMaxConsecutiveSum2 {
    
    public static void main(String[] args) {
       // a = [-2, 2, 5, -11, 6] == 7 at least contains 1 elment 
       //max_sum = interger.MIN_VALUE , current_sum
       //int[] array = {-2, 2, 5, -11, 6};
       int[] array = {-7, -1, 10, 11, -3};
        System.out.println("Max Consecutive sum: " +arrayMaxConsecutiveSum2(array));
    }
    
    static int arrayMaxConsecutiveSum2(int[] arr) {
        int max_sum = arr[0]; // -7 
        int current_sum = max_sum; // -7         
        for (int i = 1; i < arr.length; i++) {
            current_sum = Math.max(arr[i] + current_sum, arr[i]); //-1, 10, 21, 18
            max_sum = Math.max(current_sum, max_sum); //-1, 9, 21, 21
        }
        return max_sum; //21
    }
    
    
}
