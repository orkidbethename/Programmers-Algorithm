import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] list = s.split(" ");
        Integer[] num = new Integer[list.length];
        //System.out.println(Arrays.toString(list));
        
        for(int i=0; i<list.length; i++){
            num[i] = Integer.parseInt(list[i]);
        }
        Arrays.sort(num);
        //System.out.println(Arrays.toString(num));
        
        answer += Integer.toString(num[0]);
        answer += " ";
        answer += Integer.toString(num[num.length-1]);
        
        return answer;
    }
}
