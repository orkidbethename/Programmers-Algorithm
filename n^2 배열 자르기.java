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
