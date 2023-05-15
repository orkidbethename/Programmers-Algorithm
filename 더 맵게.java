import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 1;
        List<Integer> list = new ArrayList<>();
        
        for(int a:scoville){
            list.add(a);
        }
        list.sort(Comparator.naturalOrder());
        
        if(list.get(0) >= K){
            answer = 0;
            return answer;
        }
            
        while(true){
            if(list.size() < 2){
                answer = -1;
                break;
            }else{
                int num = 0;
                num = list.get(0) + (list.get(1)*2);
                list.remove(0);
                list.remove(0);
                list.add(num);
                list.sort(Comparator.naturalOrder());
                //System.out.println(list +", "+num);
                
                if(list.get(0) >= K){
                    break;
                }else{
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
