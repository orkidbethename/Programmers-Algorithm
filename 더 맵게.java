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

//효율성 개선 -> PriortyQueue 사용
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = Arrays.stream(scoville).boxed().collect(Collectors.toCollection(PriorityQueue::new));
        
        int min = pq.peek();
        
        while(K>min && pq.size()>1){
            answer++;
            int a = pq.poll();
            int b = pq.poll();
            int tmp = a+(b*2);
            
            pq.add(tmp);
            min=pq.peek();
        }
        
        if(K>min){
            return -1;
        }
        return answer;
    }
}
