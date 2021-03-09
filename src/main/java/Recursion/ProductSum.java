
package Recursion;

import java.util.*;

public class ProductSum {

    public static int productSum(List<Object> array) {
        return productSumHelper(array, 1);
    }
    
    public static int productSumHelper(List<Object> array, int multiplier) {
        
        int sum = 0;
        for (Object el : array) {
            if (el instanceof ArrayList) {
                @SuppressWarnings ("Unchecked")
                ArrayList<Object> ls = (ArrayList<Object>)el;
                sum += productSumHelper(ls, multiplier + 1);
            } else {
                    sum += (int) el;
                }
        }
        return sum * multiplier;
    }
    
    public static void main(String[] args) {
       
        List<Object> array = new ArrayList<Object>();
        //array = [5, 2, [7, -1], 3, [6, [-13, 8], 4]]];
        //5 + 2 + 2 * (7 -1) + 3 + 2 * (6 + 3 * (-13 + 8) + 4
        
    }
    
}
