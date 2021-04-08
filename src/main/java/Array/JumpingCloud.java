
package Array;

import java.util.*;

public class JumpingCloud {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = scanner.nextInt();
        System.out.println("Insert only 0 or 1 for " + n + "times: ");
        int[] cloud = new int[n];
        for (int i = 0; i < n; i++) {
            cloud[i] = scanner.nextInt();
        }
        System.out.println(jumpingOnClouds(cloud));
    }
    
    static int jumpingOnClouds(int[] c) {
        int count = 0;
        // [0 1 0 0 0 1 0]
        for (int i = 0; i < c.length; i++, count++) {
            if (i + 2 < c.length && c[i+2] == 0) {
                i++;
            }
        }
        return count - 1;
    }
    
}
