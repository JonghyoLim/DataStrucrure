
package Array;

import java.util.*;

public class FindCelebrity {

    public static void main(String[] args) {
        //Time O(N)
    int[][] M = {{0, 0, 1, 0}, 
                 {0, 0, 1, 0},
                 {0, 0, 0, 0},
                 {0, 0, 1, 0}};
    System.out.println("Celebrity ID: " + FindCelebrityID(M, 4));      
    }
    
    static String FindCelebrityID(int[][] M, int n) {
      //finding celebrity 
      int a = 0, b = n - 1;  
      String foundID = ""; 
      while(a < b) {
          if (M[a][b] == 1) // [0][2] //[1][2]
              a++; //1 -> 2
          else if (M[a][b] == 0) //[0][3] 
              b--; //2
      }  
      //Check celebrity conditions 
      //if a is celebrity then all members has to know a
      //a does not know anybody
      for (int i = 0; i < n; i++) { 
          // M[a][i] = [0 0 0 0], M[i][a] = col[1, 1, 0, 1]
          if ((i != a) && (M[a][i] == 1 || M[i][a] == 0)) 
              return "No Celebrity found";
      }
      switch(a){
        case 0: foundID = "A"; break;
        case 1: foundID = "B"; break;
        case 2: foundID = "C"; break;
        case 3: foundID = "d"; break;
        case 4: foundID = "e"; break;
        case 5: foundID = "f"; break;   
      }
      return foundID;
    }
    
    

    
}
