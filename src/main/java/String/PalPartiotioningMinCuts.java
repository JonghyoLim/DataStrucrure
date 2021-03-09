
package String;

import java.util.*;

public class PalPartiotioningMinCuts {
        
    public static int palPartioningMinCuts(String str) {
        // abbamadamn
        boolean[][] palindromes = new boolean[str.length()][str.length()];
        for (int i = 0; i <str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                palindromes[i][j] = isPal(str.substring(i, j + 1)); //[0,0]= T, []
            } //end for j
        } //end for i 
        
        int[] cuts = new int[str.length()];
        Arrays.fill(cuts, Integer.MAX_VALUE);
        for (int i = 0; i < str.length(); i++) {
            if (palindromes[0][i]) {
                cuts[i] = 0;
            } else {
                cuts[i] = cuts[i - 1] + 1;
                for (int j = 1; j < i; j++) {
                    if (palindromes[j][i] && cuts[j - 1] + 1 < cuts[i]) {
                    cuts[i] = cuts[j - 1] + 1;
                    }//end if
                }//end for j
            }//end else
        }//end for i
        return cuts[str.length() - 1];
    }
    
    public static boolean isPal(String str) {
        int leftIdx = 0, rightIdx = str.length() - 1;
        while (leftIdx < rightIdx){
            if (str.charAt(leftIdx) != str.charAt(rightIdx)){
                return false;
            }
            leftIdx++; rightIdx--;
        }
        return true;
    }
    

    public static void main(String[] args) {
        String str = "abbamadamn"; // abba // madam // n 
        System.out.println("result: " +  palPartioningMinCuts(str));
        
    }
    
}
