import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        answer += n-lost.length;
         //System.out.println(Arrays.toString(reserve));
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){               
                if(reserve[j] == lost[i]){
                    answer++;
                    reserve[j] = 100;
                    lost[i] = 200;
                    break;
                }
            }
            //System.out.println(Arrays.toString(reserve));
        }
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(reserve[j]-1 == lost[i] || reserve[j]+1 == lost[i]){
                    answer++;
                    reserve[j] = 100;
                    lost[i] = 200;
                    break;
                }
            }
            //System.out.println(Arrays.toString(reserve));
        }
        
        return answer;
    }
}
