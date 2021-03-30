
package Array;

import java.util.*;

public class ArrayManipulation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Array Size:");
        int m = in.nextInt();
        
        System.out.println("Enter "+ m + " numbers each row: ");
        
        int[][] queries = new int[m][3];
        for (int i = 0; i < m; i++) {
                queries[i][0] = in.nextInt();
                queries[i][1] = in.nextInt();
                queries[i][2] = in.nextInt();
        }
        for(int[] q : queries) {
            System.out.println(Arrays.toString(q));
        }
        System.out.println("Max value after manipulation: " + arrayManipulation(n, queries));     
    }
    
    static long arrayManipulation(int n, int[][] queries) {
        long[] result = new long[n + 2];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            result[a] += k;
            result[b+1] -= k;
        }   
        System.out.println(Arrays.toString(result));
        
        long max_val = getMax(result);
        return max_val;    
    }
    
    private static long getMax(long[] result) {
        long max_val = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum += result[i];
            max_val = Math.max((max_val), sum);
        }
        return max_val;
    }
}
