import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        stack.push('s');
        
        for(int i=0;i<s.length();i++){
            if(i!=0 && (stack.peek() == '(' || stack.peek() == 's')){
                if(s.charAt(i) == ')'){
                    stack.push(s.charAt(i));
                    stack.pop();
                    stack.pop();
                }else if(s.charAt(i) == '('){
                    stack.push(s.charAt(i));
                }
            }else if(i==0){
                stack.push(s.charAt(i));
            }else{
                answer = false;
                break;
            }
        }
        
        if(stack.size() != 1){
            answer = false;
        }
        
        System.out.println(stack);

        return answer;
    }
}
