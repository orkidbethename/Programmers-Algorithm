import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int[] skipArr = new int[skip.length()];
        int[] result = new int[s.length()];
        
        for(int i=0; i<skip.length(); i++){
            skipArr[i] = (int)skip.charAt(i);
        }
        
        for(int i=0; i<s.length(); i++){
            int ascii = (int)s.charAt(i);
            
            int real = ascii + index;
            result[i] = real;
            
            for(int j=0;j<skipArr.length; j++){
                if(result[i]>=skipArr[j] && result[i]-index<skipArr[j] ){
                    result[i]++;
                    if(result[i]>122){
                        result[i] = result[i]-123+97;
                    }
                    System.out.println(ascii);
                }
                
            }
            
            answer += (char)result[i];
        }
        
        System.out.println(answer);
        

        return answer;
    }
}
