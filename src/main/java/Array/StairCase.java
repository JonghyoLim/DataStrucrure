
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
        stairCase(4);
    }
    
    static void stairCase(int n) {
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
