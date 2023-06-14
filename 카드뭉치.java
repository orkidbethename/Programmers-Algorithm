import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        
        for(int i=0; i<cards1.length; i++){
            stack1.push(cards1[cards1.length-i-1]);
        }
        for(int i=0; i<cards2.length; i++){
            stack2.push(cards2[cards2.length-i-1]);
        }
        
        for(int i=0; i<goal.length; i++){
            
            if(stack1.size() != 0 && goal[i].equals(stack1.peek())){
                stack1.pop();
            }else if(stack2.size() != 0 && goal[i].equals(stack2.peek())){
                stack2.pop();
            }else{
                answer = "No";
                return answer;
            }
        }
        
        
        return answer;
    }
}
