import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int count = 0;
        int[] arr = new int[number];
        
        for(int i=0; i<number; i++){
            for(int j=1; j*j<=(i+1); j++){
                if(j*j == (i+1)) count++;
                else if((i+1)%j == 0) count +=2;
            }
            arr[i] = count;
            count = 0;
        }
        //System.out.println(Arrays.toString(arr));
        
        for(int i=0; i<number; i++){
            if(arr[i] > limit){
                arr[i] = power;
            }
            
            answer += arr[i];
        }
        
        return answer;
    }
}
