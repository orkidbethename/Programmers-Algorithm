import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int wTmp = 0;
        int hTmp = 0;
        
        for(int i=0; i<sizes.length; i++){
            Arrays.sort(sizes[i]);
            
            if(i == 0){
                wTmp = sizes[i][0];
                hTmp = sizes[i][1];
            }else{
                if(wTmp <= sizes[i][0]){
                    wTmp = sizes[i][0];
                }
                if(hTmp <= sizes[i][1]){
                    hTmp = sizes[i][1];
                }
            }
        }
        
        answer = wTmp*hTmp;
        
        return answer;
    }
}
