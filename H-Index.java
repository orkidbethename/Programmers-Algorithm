import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int count = 0;
        Arrays.sort(citations);
        
        for(int i=0; i<citations.length; i++){
            int h = citations.length-i;
            
            for(int a:citations){
                if(a>=h)
                    count++;
            }

            if(h<=count){
                answer = h;
                break;
            }
            count = 0;
        }
        
        return answer;
    }
}
