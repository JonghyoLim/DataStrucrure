package String;

import java.util.*;

public class CountSortedVowelStrings {

    public static void main(String[] args) {
        int n = 2;
        System.out.println(countVowelStrings(n));
    }
    
    static int countVowelStrings(int n) {
        if (n == 1) return 5;
        
        int[] arr = new int[]{1, 1, 1, 1, 1};
        int sum = 5;
        for (int i = 2; i <= n; i++) {
            int[] copy = new int[5];
            for (int j = 0; i < 5; j++) {
                if (j == 0) {
                    copy[j] = sum;
                } else {
                    copy[j] = copy[j - 1] - arr[j - 1];
                }
            }
            arr = Arrays.copyOf(copy, 5);
            sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += arr[j];
            }
        }
        return sum;
    }
    
}
