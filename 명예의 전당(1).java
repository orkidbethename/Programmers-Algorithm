import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<score.length; i++){
            list.add(score[i]);
            Collections.sort(list);
            if(list.size()<=k){
                answer[i] = list.get(0);
            }else{
                answer[i] = list.get(list.size()-k);
            }
        }
        
        return answer;
    }
}
