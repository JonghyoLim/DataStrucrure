
package Array;

import java.util.*;

public class SortedSquaredArray {
    
    static int[] sortedSquaredArrayV2(int[] a) {
        int[] sortedArray = new int[a.length];
        int left = 0, right = a.length - 1;  //left = 1 , right = 5
        for (int i = a.length - 1; i >= 0; i--){
            if(Math.abs(a[left]) > a[right]) {
                sortedArray[i] = (int) Math.pow(a[left], 2);
                left++;
            } else {
                sortedArray[i] = (int) Math.pow(a[right], 2);
                right--;
            }
        }
        return sortedArray;
    }
    
    static int[] sortedSquaredArrayV3(int[] a) {
        int[] sortedArray = new int[a.length];
        int left = 0, right = a.length - 1;  //left = 1 , right = 5
        while(left <= right) {
            if (Math.abs(a[left]) > Math.abs(a[right])) {
                sortedArray[right] = (int) Math.pow(a[left], 2);
                left++; //1
            } else {
                sortedArray[right - 1] = (int) Math.pow(a[right], 2);
                right--;//4
            }
        }
        return sortedArray;
    }
    static int[] sortedSquaredArrayV1(int[] array) {
        int[] sortedSquared = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            sortedSquared[i] = (int)Math.pow(value, 2); //Math.pow is Double
        }
        Arrays.sort(sortedSquared);
        return sortedSquared; //1.727s
    }
   
    public static void main(String[] args) {
       //int[] array = {-3, -2, -4}; // [4, 9, 16]
       int[] array = {-6, -4, 1, 2, 3, 5}; // [1, 4, 9, 16, 25, 36]
       //result = [1, 4, 9, 25, 36, 64, 81]
        System.out.println("Sorted Squared number Array:");
        System.out.println(Arrays.toString(sortedSquaredArrayV3(array)));
        System.out.println(Arrays.toString(sortedSquaredArrayV2(array)));
        System.out.println(Arrays.toString(sortedSquaredArrayV1(array)));
    }
    
}
