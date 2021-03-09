
package Sort;

import java.util.*;


public class BubbleSort {
    
    public static int[] bubbleSort (int[] array) {
        if (array.length == 0) return new int[] {};
        boolean isSorted = false;
        int counter = 0;
        
        while(!isSorted) {
            isSorted = true;         
            for (int i = 0; i < array.length - 1 - counter; i++) {
                if (array[i] > array[i + 1]) {
                    swap(i, i + 1, array);
                    isSorted = false;
                }// end if
            }// end for 
            counter++;
        } // end while method   
        return array;
    }// end bubbleSort method 
    
    static void swap(int a, int b, int[] array){
        int temp = array[b];
        array[b] = array[a];
        array[a] = temp;
    } // end swap method
            
    public static void main(String[] args) {
            
        int[] array = {11, 24, 36, 2, 5, 11, 17, 9};
        System.out.println( Arrays.toString(bubbleSort(array)));
    }
    
}
