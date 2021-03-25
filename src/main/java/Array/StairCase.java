
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
        stairCaseV1(5);
        stairCaseV2(5);
        stairCaseV3(5);
        stairCaseV4(5);
        stairCaseV5(5);
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
    static void stairCaseV3(int n) {
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j++) {
                if (j <= n - 1 - i) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    } 
    
    static void stairCaseV4(int n) {
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               // j = 00, 10, 11 20, 21, 22, 30, 31, 32, 33 
               if (j <= i) {
                   System.out.print("#");
               } else {
                   System.out.print(" ");
               }
           }
            System.out.println("");
       } 
    }
    
    static void stairCaseV5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) System.out.print("#");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
