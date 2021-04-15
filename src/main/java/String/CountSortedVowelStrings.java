package String;

import java.util.*;

public class CountSortedVowelStrings {
   
    static int countVowelStrings(int n) {
        //num of combinations with repetitions
        //(n+4)! / 4!
        //Factorian (!) if 5 elements 5-1= 4
        return (n+4)*(n+3)*(n+2)*(n+1)/(4*3*2*1);
        
        ///Factorian (!) if 4 elements 4-1= 3
        //return (n+3)*(n+2)*(n+1)/(3*2*1);
        
        //Time:O(5N) Space:O(6N)
//        int[][] dp = new int[n+1][6];
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=5; j++){
//                dp[i][j] = ((i > 1) ? dp[i-1][j] : 1) + dp[i][j-1];
//            }
//        }
//        return dp[n][5];
    }

    
        
    public static void main(String[] args) {
        int n = 2;// 15 
        System.out.println(countVowelStrings(n));
    }
}
