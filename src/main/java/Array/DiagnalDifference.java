
package Array;

import java.util.*;

public class DiagnalDifference {

    
    public static int diagonalDifference(int[][] ar){
        int left_sum = 0, right_sum = 0;
        
        for(int i = 0; i < ar.length; i++){
            left_sum += ar[i][i];
            right_sum += ar[i][ar.length - 1 - i];
        }
        
        return Math.abs(left_sum - right_sum);
    }
    
    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Enter a size of array: "); //3
        int n = in.nextInt();
        
        
        int[][] ar = new int[n][n];
        
        for (int i = 0; i < ar.length; i++){
            for (int j = 0 ; j < ar.length; i++){
                ar[i][j] = in.nextInt();
            }
        }
        
        for(int[] row : ar) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
        
        int result = diagonalDifference(ar);
        System.out.println(" Result:" + result);
    }
    
}
