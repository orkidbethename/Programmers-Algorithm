import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = {};
        int[] nArr = new int[(int)Math.pow(n,2)];
        
        for(int i=0; i<nArr.length; i++){
            if((i+1)%n == 0){
                nArr[i] = n;
            }else{
                nArr[i] = (i+1)%n;
            }
        }
        int count = 1;
        for(int i=0; i<nArr.length; i++){
            if(nArr[i]<=count){
                nArr[i] = count;
            }
            if((i+1)%n == 0){
                count++;
            }
        }
        //System.out.println((int)left);
        
        answer = Arrays.copyOfRange(nArr,(int)left,(int)right+1);
        
        return answer;
    }
}

//메모리 초과 수정
class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left)+1];
        
        for(int i=0; i<answer.length; i++){
            int x = (int)(left/n+1);
            int y = (int)(left%n+1);
            
            left++;
            answer[i] = Math.max(x,y);
        }
        
        return answer;
    }
}
