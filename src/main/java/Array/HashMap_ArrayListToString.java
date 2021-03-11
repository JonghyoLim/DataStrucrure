
package Array;

import java.util.*;

public class HashMap_ArrayListToString {
    
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>(); 
        competitions.add(new ArrayList<String>());
        competitions.get(0).add(0, "LA"); //
        competitions.get(0).add(1, "SF");  
        competitions.add(new ArrayList<String>(Arrays.asList("SF", "NY")));
        competitions.add(2, new ArrayList<String>(Arrays.asList("NY", "LA")));
        competitions.add(new ArrayList<String>(Arrays.asList("LA", "NY")));
        competitions.add(4, new ArrayList<String>(Arrays.asList("LA", "SF")));
        
        System.out.println("competitions = " + competitions);
        
        int[] nums = {0, 0, 0, 1, 1};
        ArrayList<Integer> results = new ArrayList<Integer>();
        for (int num : nums){
            results.add(num);
        }
        System.out.println("results = " + results);
        
        System.out.println(winnerTeam(competitions, results));     
    }// end main
    
    public static String winnerTeam(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results){
        String CurrentBestTeam = "";
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put(CurrentBestTeam, 0); // default hashmap 
        int Home_Team_Won = 1; // 1: Hometeam won, 0:Awayteam won from results = [0, 0 , 0, 1, 1] 
        for (int i = 0; i < competitions.size(); i++) {
            ArrayList<String> competition = competitions.get(i); // [LA, SF], [SF, NY], [NY, LA], [LA, NY], [LA, SF]
            int result = results.get(i); // [0], [0], [0], [1], [1]
            
            String homeTeam = competition.get(0); // LA - SF - NY - LA - LA
            String awayTeam = competition.get(1); // SF - NY - LA - NY - SF
            
            //result 0 == 1 false goes to AwayTeam won
            String winningTeam = (result == Home_Team_Won) ? homeTeam : awayTeam; 
            
            scoreUpdate(winningTeam, 3, scores); // (SF, 3) (NY, 3) (LA, 3) (LA, 3)(LA, 3)
           
            if (scores.get(winningTeam) > scores.get(CurrentBestTeam)) {
                CurrentBestTeam = winningTeam;
         
            }//end if
        }//end for
        
        System.out.println("Points: " + scores.get(CurrentBestTeam)); //9 points
        
        return CurrentBestTeam;
    }//
    public static void scoreUpdate(String team, int points, HashMap<String, Integer> scores){
        if (!scores.containsKey(team)){
            scores.put(team, 0); //  (SF, 3) (NY, 3) (LA, 3)
        }
        scores.put(team, scores.get(team) + points); //(LA, 3 + 3) - (LA, 6 + 3)
    }
    
}
