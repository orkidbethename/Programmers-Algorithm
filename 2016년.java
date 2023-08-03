import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] dayOfWeek = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        
        Calendar cal = Calendar.getInstance();
        cal.set(2016,a-1,b);
        int dow = cal.get(Calendar.DAY_OF_WEEK);
        
        answer = dayOfWeek[dow-1];
        
        //System.out.println(dow);
        
        return answer;
    }
}
