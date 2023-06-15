import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>(); 
        
        Arrays.sort(score);
        for(int i=0; i<score.length; i++){
            stack.push(score[i]);
        }

        while(stack.size()>0){
            if(stack.size()<m){
                break;
            }else{
                int[] sub = Arrays.copyOfRange(score, stack.size()-m, stack.size());
                answer += (sub[0]*m);
                
                for(int i=0; i<m; i++){
                    stack.pop();
                }
            }
        }
        
        return answer;
    }
}
