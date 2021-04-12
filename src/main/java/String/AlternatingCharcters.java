
package String;

import java.util.*;

public class AlternatingCharcters {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        int q = scanner.nextInt();
        scanner.skip("\n");
        for (int i = 0; i < q; i++) {
            String s = scanner.nextLine();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
//        String[] s = new String[q];
//  
//        for (int i = 0; i < q; i++) {
//            s[i] = scanner.nextLine();
//        }
//        for (int i = 0; i < s.length; i++){
//            System.out.println(alternatingCharacters(s[i]));  
//        }
      
       
    }
    
    static int alternatingCharacters(String s){
        //AABAAB ->ABAB
        //remove [0], [3] => return 2;
        int min_deletion = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                min_deletion++;
            }
        }
        return min_deletion;
    }
}
