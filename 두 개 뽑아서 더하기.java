import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        //int[] answer = {};
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length-1-i; j++){
                sum = numbers[i] + numbers[i+j+1];
                
                if(list.contains(sum) == false){
                    list.add(sum);
                }
            }
        }
        
        
        list.sort(Comparator.naturalOrder());
        //System.out.println(list);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}
