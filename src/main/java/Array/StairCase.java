
package Array;

import java.util.*;

public class StairCase {
    
    public static void main(String[] args) {
       /* n = 4   | numSpace j | numSymbols i
        _ _ _ #      3           1
        _ _ # #      2           2
        _ # # #      1           3
        # # # #      0           4
       */  
        stairCaseV1(7);
//        stairCaseV2(4);
    }
    
    static void stairCaseV1(int n) {
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                if (j < n - i - 1){
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
    }
    
    static void stairCaseV2(int n) {
        for (int numSymbols = 1; numSymbols <= n; numSymbols++) {
            int numSpaces = n - numSymbols;
            
            //print out the spaces
            for (int i = 0; i < numSpaces; i++){
                System.out.print(" ");
            }
            
            //print out the symbols
            for (int i = 0; i < numSymbols; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    
}
