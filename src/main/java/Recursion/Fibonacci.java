
package Recursion;



public class Fibonacci {
    
    
    public static int getNthFib(int n) {
     //f(n) = f(n-1) + f(n-2)
                  // 1 1 2 3 5 8 13 21 34
                  //recursion
//                  if(n <= 2) {return 1;}
//                  else if (n == 0) return 0;
//                  else return getNthFib(n-1) + getNthFib(n-2);	
                  
                  // 0 1 1 2 3 5 8 13 21 34
                  if (n <= 1) return n;
                  else return getNthFib(n-1) + getNthFib(n-2);	

    }
    
    public static void main(String[] args) {
        
        System.out.println(getNthFib((9)));
        
    }
    
}
