
package String;

import java.util.*;

public class AlternatingCharcters {

    private static final Scanner scanner = new Scanner(System.in);
    
    static int alternatingCharacters(String s){
        //AABAAB - ABAB remove [0],[3]=>return 2
        //AAAABBBBBAB -[0][1][2][4][5][6][7]=>return 7
        int min_deletion = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                min_deletion++;
            }
        }
        return min_deletion;
    }
    
    public static void main(String[] args) {

        int q = scanner.nextInt();
        scanner.skip("\n");
        for (int i = 0; i < q; i++) {
            String s = scanner.nextLine();
            System.out.println(alternatingCharacters(s));
        }   
    }
    

}
