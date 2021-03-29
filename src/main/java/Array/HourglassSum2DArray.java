
package Array;

import java.util.*;

public class HourglassSum2DArray {

    public static void main(String[] args) {
        int[][] a = {{-9, -9, -9, 1, 1, 1},
                    { 0, -9, 0, 4, 3, 2},
                    { -9, -9, -9, 1, 2, 3},
                    { 0, 0, 8, 6, 6, 0},
                    { 0, 0, 0, -2, 0, 0},
                    { 0, 0, 1, 2, 4, 0}};
        System.out.println("Max Sum of hourglass: " + hourglassMaxSum(a));
    }
    
    static int hourglassMaxSum(int[][] a) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length - 2; i++) {
            for (int j = 0; j < a[i].length - 2; j++) {
                int sum =  a[i][j] + a[i][j+1] + a[i][j+2] +
                                   a[i+1][j+1] +
                           a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];
                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }
    
}
