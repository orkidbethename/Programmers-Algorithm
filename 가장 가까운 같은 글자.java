import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashSet<String> set = new HashSet<String>();
        char[] arr = s.toCharArray();

        
        for(int i=0; i<s.length(); i++){
            set.add(Character.toString(s.charAt(i)));
            if(set.size()<i+1){
                for(int j=0; j<i; j++){
                    if(arr[i] == s.charAt(j)){
                        answer[i] = (i-j);
                        set.add(String.valueOf(i));
                    }
                }
            }else{
                answer[i] = -1;
            }
        }
        System.out.println(set);
        
        return answer;
    }
}
