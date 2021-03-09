
package Recursion;

import java.util.ListIterator; 
import java.util.Stack; 

public class Stack_Sort {
    
    static void sortedInsert(Stack<Integer> s, int x) {
        
        //inserted item is greater than top (more than all exsting)
        if (s.isEmpty() || x > s.peek()){
            s.push(x);
            return;
        }
        
        //if top is greater, then remove the top item and recur
        int temp = s.pop();
        sortedInsert(s, x);
        
        //put back the top item removed earlier
        s.push(temp);
        
    }
    
    
    static void  sortStack(Stack<Integer> s){
        if (!s.isEmpty()){
            int x = s.pop();
            sortStack(s);
            
            sortedInsert(s, x);
        }
    }
    
    
    static void printStack(Stack<Integer> s) {
        ListIterator<Integer> lt = s.listIterator();
        
        //forwrding
        while (lt.hasNext()) 
            lt.next();
            //System.out.print(lt.next() + " ");
        System.out.println(" ");
            
        //printing to top to bottom
        while (lt.hasPrevious()) {
            System.out.print(lt.previous() + " ");
        }
        
    }
    
 
    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();
        s.push(30); 
        s.push(-5); 
        s.push(18); 
        s.push(14); 
        s.push(-3); 
        
        System.out.println("Stack element before sorting: ");
        printStack(s);
        
        sortStack(s); 
  
        System.out.println( 
            " \n\nStack elements after sorting:"); 
        printStack(s); 
    }
    
}
