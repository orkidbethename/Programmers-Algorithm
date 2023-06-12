import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int count = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<section.length; i++){
            stack.push(section[section.length-i-1]);
        }
        
        while(stack.size()>0){
            int range = stack.peek()+m;
            
            while(true){
                if(stack.size() != 0 && stack.peek()<range){
                    stack.pop();
                }else{
                    break;
                }
            }
            answer++;
        }
        
        return answer;
    }
}
