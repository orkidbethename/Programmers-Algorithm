import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            if(i==0){
                stack.push(arr[i]);
            }else{
                if(arr[i-1] != arr[i]){
                    stack.push(arr[i]);
                }
            }
        }

        
        int[] answer = new int[stack.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[answer.length-i-1] = stack.peek();
            stack.pop();
        }
        return answer;
    }
}
