
package Array;

import java.util.*;

public class ThreeNumSum {
    
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        
        Arrays.sort(array);
        List<Integer[]> triplets = new ArrayList<Integer[]>();
        for (int i = 0; i < array.length - 2; i++){
           int left = i + 1 ;
           int right = array.length - 1;
           while (left < right) {
               int currentSum = array[i] + array[left] + array[right]; //cs = L + R 
               if (currentSum == targetSum){
                   Integer[] newTriplet = {array[i], array[left], array[right]};
                   triplets.add(newTriplet);
                   left++; right--;
               } else if (currentSum < targetSum) {
                   left++;
               } else if (currentSum > targetSum) {
                   right--;
               }
           }
        }
        return triplets;
        
    }
   
    
    public static void main(String[] args) {
        
        List<Integer[]> finalTriplets = new ArrayList<Integer[]>();
  
        int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
        finalTriplets = threeNumberSum(array, 0);    
        finalTriplets.forEach(arr->System.out.print(Arrays.toString(arr) + " "));
    }   
}
 