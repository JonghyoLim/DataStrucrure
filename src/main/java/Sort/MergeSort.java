
package Sort;

import java.util.*;

public class MergeSort {

    public static void main(String[] args) {
        
        int[] array = {8, 5, 2, 9, 5, 6, 3};
        System.out.println("After Merge Sort: " + Arrays.toString(mergeSort(array)));
    }
    
    static int[] mergeSort(int[] array){
        if (array.length <= 1) return array;
        int[] tempArray = array.clone();
        mergeSort(array, 0, array.length - 1, tempArray);
        return array;
    }
 
    static void mergeSort(int[] mainArray, int startIdx, int endIdx, int[] tempArray) {
        if (startIdx == endIdx) return;
        
        int middleIdx = (startIdx + endIdx) / 2;
        mergeSort(tempArray, startIdx, middleIdx, mainArray);
        mergeSort(tempArray, middleIdx + 1, endIdx, mainArray);        
        doMerge(mainArray, startIdx, middleIdx, endIdx, tempArray);
    }
    static void doMerge(int[] mainArray, int startIdx, int middleIdx, int endIdx, int[] tempArray){
        int i = startIdx, j = middleIdx + 1, k = startIdx; 
        while (i <= middleIdx && j <= endIdx) {
            if (tempArray[i] <= tempArray[j]) {
                mainArray[k++] = tempArray[i++];
            } else {
                mainArray[k++] = tempArray[j++];
            }
        }
        while (i <= middleIdx) {
            mainArray[k++] = tempArray[i++];
        }
        while (j <= endIdx) {
            mainArray[k++] = tempArray[j++];
        }
    }
}
