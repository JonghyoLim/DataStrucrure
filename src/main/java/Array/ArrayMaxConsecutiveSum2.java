
package Array;

import java.util.*;

public class ArrayMaxConsecutiveSum2 {
    
    public static void main(String[] args) {
       // a = [-2, 2, 5, -11, 6] == 7 at least contains 1 elment 
       //max_sum = interger.MIN_VALUE , current_sum
       //int[] array = {-2, 2, 5, -11, 6};
       //int[] array = {-7, -1, 10, 11, -3};
       int[] array = {3, -4, 21, -18, 15};
        System.out.println("Max Consecutive sum: " +arrayMaxConsecutiveSum2(array));
    }
    
    static int arrayMaxConsecutiveSum2(int[] arr) {
        int max_sum = arr[0]; // //3
        int current_sum = max_sum; // 3         
        for (int i = 1; i < arr.length; i++) {
            current_sum = Math.max(arr[i] + current_sum, arr[i]); //-1 21 3 18
            max_sum = Math.max(current_sum, max_sum); //3 21 21 21
        }
        return max_sum; //21
    }
    
    
}
