
package Array;

import java.util.*;

public class NewYearChaos {
    
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 4};
        minimumBribes(arr);
        
    }
    
    static void minimumBribes(int[] arr){
        int swapCount = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            
            if (arr[i] != i + 1) { //when you dont bribe, ith position wherever you are.
                if (((i-1) >= 0) && arr[i-1] == (i+1)) {
                    swapCount++;
                    swap(arr, i, i - 1);
                }else if (((i-2) >= 0) && arr[i-2] == (i + 1)) {
                    swapCount += 2;
                    swap(arr, i - 2, i - 1);
                    swap(arr, i - 1, i);
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(swapCount);
    }
    
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
