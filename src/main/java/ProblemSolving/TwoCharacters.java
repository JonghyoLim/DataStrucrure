
package ProblemSolving;

import java.util.*;

public class TwoCharacters {

    public static void main(String[] args) {
        String s = "beabeefeab";
        System.out.println("Longest string: " + alternate(10, s.toLowerCase()));
    }
    
    static int alternate(int n, String s) {
        /* Edge case */
        if (n <= 1) return 0;
        
        /* Create arrays representing the 26^2 subproblems */
        int [][] pair  = new int[26][26];
        int [][] count = new int[26][26];
        
        for (int i = 0; i < n; i++) {
            char letter   = s.charAt(i); //b,
            int letterNum = letter - 'a';//1, 
            //b e a b e e f e a b
            //* Update row */
            for (int col = 0; col < 26; col++) {
                if (pair[letterNum][col] == letter) {
                    count[letterNum][col] = -1;
                }
                if (count[letterNum][col] != -1) {
                    pair[letterNum][col] = letter;
                    count[letterNum][col]++;
                }
            }
            
            /* Update column */
            for (int row = 0; row < 26; row++) {
                if (pair[row][letterNum] == letter) {
                    count[row][letterNum] = -1;
                }
                if (count[row][letterNum] != -1) {
                    pair[row][letterNum] = letter;
                    count[row][letterNum]++;
                }
            }
        }
        
         /* Find max in "count" array */
        int max = 0;
        for (int row = 0; row < 26; row++) {
            for (int col = 0; col < 26; col++) {
                max = Math.max(max, count[row][col]);
            }
        }
        
        return max;
    }  
    
}
