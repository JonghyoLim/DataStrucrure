
package Array;

import java.util.*;
public class FIndLongestSubarrayBySum {
    
    public static void main(String[] args) {
        // arr = [1,2,3,4,5,0,0,0,6,7,8,9,10]
        //if sum = 15; find Longest Subarray range = [1, 8] 
        //current_sum = Interger.MAX_VALUE
        //left = 0, right = 0 pointers
        int[] arr = {1,3,4,3,3,2,2,1,3,2,5,1};
        int sum = 14;
        System.out.println("Find Longest Subarray:");
        System.out.println(Arrays.toString(findLongestSubarray(sum, arr)));
    }
    
    static int[] findLongestSubarray(int sum, int[] arr){
        int left = 0, right = 0, current_sum = 0;
        int[] range = new int[] {-1}; // if not found sum
        
        while (right < arr.length) {
            current_sum += arr[right]; //when 8
            while (left < right && current_sum > sum){
                current_sum -= arr[left++];
            }
            if (current_sum == sum && 
                (range.length == 1 || range[1] - range[0] < right - left)){
                //update immediately 
                range = new int[] {left + 1, right +1}; //[1,5] [1,6] [1,7] [1,8]
            }
            right++;
        }
        return range;
    }
}
