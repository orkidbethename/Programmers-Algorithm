import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Arrays.sort(tangerine);
        List<Integer> list = Arrays.stream(tangerine).boxed().collect(Collectors.toList());
        
        int[] count = new int[list.get(list.size()-1)];
        
        for(int i=0; i<count.length; i++){
            count[i] = Collections.frequency(list,i+1);
        }
        
        Arrays.sort(count);
        
        int n = 0;
        for(int i=0; i<count.length; i++){
            if(n<k){
                n += count[count.length-1-i];
                answer++;
            }else{
                break;
            }
        }
        
        return answer;
    }
}
