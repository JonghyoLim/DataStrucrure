
package Array;

import java.util.*;

public class FirstLastElementInSortedArray {

    public static void main(String[] args) {
        // First and Last postion of element in Sorted Array
        //num = [5,7,7,8,8,8,10], target = 8; output= [3, 5]
        //target = 6; output= [-1, -1]
        //Binary Search
        int[] nums = {2,2,3,4,4,6,6,8,8,10};
        int x = 2;
        System.out.println("Search Range of target " + x + ": " + Arrays.toString(searchRange(nums, x)));
    }
    
    static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findStartingIndex(nums, target);
        result[1] = findEndingIndex(nums, target);
        return result;
    }
    
    static int findStartingIndex(int[] nums, int target) {
        int index = -1;
        int start = 0, end = nums.length - 1;
        
        while (start <= end){
            int midPoint = start + (end - start) / 2;

            if (nums[midPoint] >= target) {
                end = midPoint - 1;
            } else {
                start = midPoint + 1;
            }
            
            if (nums[midPoint] == target) index = midPoint;
        }
        return index;
    }
    
     static int findEndingIndex(int[] nums, int target) {
        int index = -1;
        int start = 0, end = nums.length - 1;
        
        while (start <= end){
            int midPoint = start + (end - start) / 2;
            //num = [5,7,7,8,8,8,10], target = 8; output= [index,]
            if (nums[midPoint] <= target) {
                start = midPoint + 1;
            } else {
                end = midPoint - 1; 
            }
            if (nums[midPoint] == target) index = midPoint;
        }
        return index;
    }
    
}
