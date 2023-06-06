import java.util.*;

class Solution {
    public boolean isPrime(int n){
        for(int i=2; i<=(int)Math.sqrt(n); i++){
            if(n == 1){
                return false;
            }
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
    public boolean isContain(int[] arr, int m){
        int[] tmp = arr.clone();
        
        while(m>0){
            if(tmp[m%10] == 0){
                return false;
            }
            
            tmp[m%10]--;
            m /= 10;
        }
        
        return true;
    }
    
    public int solution(String numbers) {
        int answer = 0;
        String[] split = numbers.split("");
        int[] arr = new int[10];
        
        for(String s:split){
            arr[Integer.parseInt(s)]++;
        }
        
        for(int i=2; i<1000000; i++){
            if(isPrime(i) && isContain(arr,i)){
                answer++;
            }
        }
        
        return answer;
    }
}
