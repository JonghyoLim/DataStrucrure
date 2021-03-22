
package Graph;

import java.util.*;

public class NumberOfIslands {

    public static void main(String[] args) {
        
        char[][] islands = {{'1', '1', '0', '0','0'},
                            {'1', '1', '0', '0', '0'},
                            {'0', '0', '1', '0', '0'},
                            {'0', '0', '0', '1', '1'}};
        System.out.println("Number of Islands: " + numOfIslands(islands));
        
    }
    
   static int numOfIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count += 1;
                    BreadthFirstSearch (grid, i, j);
                }
            }
        }
     
        return count;
    }
   
   public static void BreadthFirstSearch(char[][] grid, int i, int j) {
       if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0')
           return;
       
       grid[i][j] = '0';
       BreadthFirstSearch(grid, i + 1, j); //up
       BreadthFirstSearch(grid, i - 1, j); //down
       BreadthFirstSearch(grid, i, j - 1); //left
       BreadthFirstSearch(grid, i, j + 1); //right
       
   }
}
