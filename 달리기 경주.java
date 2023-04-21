//초안

import java.util.Arrays;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        //String[] answer = {};
        int temp_key;
        String temp_value;
        int num = 0;
        
        //System.out.println(Arrays.toString(players));
        
        for(int i=0; i<callings.length; i++){
            for(int j=0; j<players.length; j++){
                if(players[j].equals(callings[i]) == true){
                    num = j;
                    break;
                }
            }
            
            temp_value = players[num-1];
            
            players[num-1] = callings[i];
            players[num] = temp_value;
        }
        
        //System.out.println(Arrays.toString(players));
        
        return players;
    }
}

