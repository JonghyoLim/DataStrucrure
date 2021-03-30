
package Array;

import java.util.*;

public class MinimunSwaps2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        System.out.println("Minimum swap(s) of array: " + minimumSwaps(a));
    }
    
    static int minimumSwaps(int[] a){
        boolean isVisited[] = new boolean[a.length + 1]; //default is false
        HashMap<Integer, Integer> nodeMap = new HashMap<Integer, Integer>();
        
        for (int i = 1; i < isVisited.length; i++) {
            nodeMap.put(i, a[i - 1]);
        }
        
        int count = 0;
        for (int key = 1; key <=nodeMap.size(); key++) {
            int nextNode;
            
            if (isVisited[key] == false) {
                isVisited[key] = true;
                
                if (key != nodeMap.get(key)) { 
                    int temp = nodeMap.get(key);// temp = 4
                    
                    while (!isVisited[temp]) {
                        isVisited[temp] = true;
                        nextNode = nodeMap.get(temp); //nextNode = 2
                        temp = nextNode; //temp = 2
                        count++;
                    }
                }     
            }
        }
        
        return count;
    }
}
