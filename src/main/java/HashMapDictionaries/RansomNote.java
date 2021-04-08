
package HashMapDictionaries;

import java.util.*;

public class RansomNote {
    
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");
        int m = Integer.parseInt(mn[0]);//6 
        int n = Integer.parseInt(mn[1]);//4 
        
        String[] magazine = new String[m];
        String[] magazineWords = scanner.nextLine().split(" ");//[give me one grand today night]
        for (int i = 0; i < m; i++) {
            String magazineWord = magazineWords[i];//give //me //one //grand //today //night
            magazine[i] = magazineWord;//[give] [me] [one] [grand] [today] [night]
        }
        
        String[] note = new String[n];//4
        String[] noteWords = scanner.nextLine().split(" ");//[give one grand today]
        for (int i = 0; i < n; i++) {
            String noteWord = noteWords[i];//give //one //grand //today 
            note[i] = noteWord; //[give] [one] [grand] [today] 
        }
        
        checkMagazine(magazine, note);
    }
    
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> magazineWords = new HashMap<>();
        for (String word : magazine) {
            if (magazineWords.containsKey(word)) {
                magazineWords.put(word, magazineWords.get(word) + 1);
            } else {
                magazineWords.put(word, 1);
            } // end else
        }// end for
        
        for (String word : note) {
            if (magazineWords.containsKey(word)) {
                int count = magazineWords.get(word);
                if (count <= 0) {
                    System.out.println("No");
                    return;
                } //end if
                count--;
                magazineWords.put(word, count);
            }
            else if (!magazineWords.containsKey(word)) {
                System.out.println("No");
                return;
            } // else if
        }// end for
        System.out.println("Yes");
    }//end method
        
    
    
}
