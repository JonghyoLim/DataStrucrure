
package Array;

import java.util.*;

public class FindCelebrity {
    //SOTI testing
    public static void main(String[] args) {
        //Time O(N)
    int[][] M = {{0, 1, 1, 0, 1}, 
                 {1, 0, 0, 1, 1},
                 {1, 1, 0, 1, 1},
                 {1, 0, 1, 0, 1},
                 {0, 0, 0, 0, 0}};
    System.out.println("Celebrity ID: " + FindCelebrityID(M, 5));      
    }
    
    static String FindCelebrityID(int[][] M, int n) {
      //finding celebrity: all ppl knows celebrity
      int a = 0, b = n - 1;  
      String foundID = ""; 
      while(a < b) {
          if (M[a][b] == 1)//[0][4]//[1][4]...[3][4]
              a++;//1,2,3,4
          else if (M[a][b] == 0) 
              b--; 
      }  
      //Check celebrity conditions 
      //if a is celebrity then all members has to know a
      //a does not know anybody
      for (int i = 0; i < n; i++) { 
          // M[a][i] = [0 0 0 0 0], M[i][a] = [1, 1, 1, 1, 0]
          if ((i != a) && (M[a][i] == 1 || M[i][a] == 0)) 
              return "No Celebrity found";
      }
      switch(a){
        case 0: foundID = "A"; break;
        case 1: foundID = "B"; break;
        case 2: foundID = "C"; break;
        case 3: foundID = "D"; break;
        case 4: foundID = "E"; break;
        case 5: foundID = "F"; break;   
      }
      return foundID;
    }
    
    

    
}
