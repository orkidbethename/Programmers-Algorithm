import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        for(int i=1; i<topping.length; i++){
            int[] bro1 = Arrays.copyOfRange(topping,0,i);
            int[] bro2 = Arrays.copyOfRange(topping,i,topping.length);
            
            //System.out.println(Arrays.toString(bro1)+", "+Arrays.toString(bro2));
            
            Set<Integer> set1 = new HashSet<Integer>(Arrays.stream(bro1).boxed().collect(Collectors.toList()));
            Set<Integer> set2 = new HashSet<Integer>(Arrays.stream(bro2).boxed().collect(Collectors.toList()));
            
            if(set1.size() == set2.size()){
                answer++;
            }
        }
        
        
        return answer;
    }
}
