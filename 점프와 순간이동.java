import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 0;
        int b = 0;
        
        while(true){
            b = n%2;
            n /= 2;
            
            if(b == 1){
                answer++;
            }else if(n == 1){
                answer++;
                break;
            }else if(n == 0){
                break;
            }
        }

        return answer;
    }
}
