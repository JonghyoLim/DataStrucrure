
package Sort;

import java.util.*;

public class ThreeNumberSort {

    public static void main(String[] args) {
        int[] array = {1, 0, 0, -1, -1, 0, 1, 1};
        int[] order = {0, 1, -1};
        System.out.println("Result: " + Arrays.toString(threeNumberSort(array, order)));
           
    }
    
    public static int[] threeNumberSort(int[] array, int[] order) {
        int[] valueCounts = new int[]{0, 0, 0};
        
        for (int element : array) {
           int orderIdx = getIndex(order, element);
           valueCounts[orderIdx]+=1;
        }
        
        for (int i =0; i < 3; i++) {
            int value = order[i];
            int count = valueCounts[i];
            
            int numEmelementBefore = getSum(valueCounts, i);
            for (int n = 0; n < count; n++) {
                int currentIdex = numEmelementBefore + n;
                array[currentIdex] = value;
            }
        }
        
        return array;
    } // end threeNumberSort method
    
    public static int getIndex(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    } // end getIndex method
    
     public static int getSum(int[] array, int end) {
        int sum = 0;
        for (int i = 0; i < end; i++) 
            sum += array[i];
        return sum;
     } // en
    
}
