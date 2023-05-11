import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[progresses.length];
        
        for(int i=0; i<progresses.length; i++){
            int count = 0;
            while(progresses[i]<100){
                progresses[i] += speeds[i];
                count++;
            }
            arr[i] = count;
        }
        int count = 1;
        for(int i=0; i<arr.length; i++){
            
            if(i==0){
                continue;
            }else{
                if(arr[i-1]<arr[i]){
                    list.add(count);
                    count = 1;
                }else{
                    int tmp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = tmp;
                    count++;
                }
            }
            System.out.println(count);
        }
        list.add(count);
        //System.out.println(list);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i).intValue();
        }
        
        return answer;
    }
}
