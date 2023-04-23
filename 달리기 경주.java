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

//시간 단축
import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<Integer,String> nameMap = new TreeMap<>();
        Map<String,Integer> rankMap = new HashMap<>();
        
        for(int i=0; i<players.length; i++){
            nameMap.put(i+1, players[i]);
            rankMap.put(players[i],i+1);
        }
        
        for(int i=0; i<callings.length; i++){
            String call = callings[i];
            int index = rankMap.get(call);
            String loose = nameMap.get(index-1);
            
            rankMap.put(call,index-1);
            rankMap.put(loose,index);
            nameMap.put(index-1,call);
            nameMap.put(index,loose);
        }
        
        int index = 0;
        for(int key : nameMap.keySet()){
            answer[index++] = nameMap.get(key);
        }
        
        return answer;
    }
}
