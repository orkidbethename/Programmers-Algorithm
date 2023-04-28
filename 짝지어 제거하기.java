import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        ArrayList<Character> list = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++){
            list.add(s.charAt(i));
            if(i>0 && list.size() > 1){
                if(list.get(list.size()-2) == list.get(list.size()-1)){
                    //System.out.println("delete");
                    list.remove(list.size()-1);
                    //System.out.println(list.get(list.size()-1));
                    list.remove(list.size()-1);
                }
            }
            //System.out.println(list);
        }
        
        if(list.size() == 0){
            answer = 1;
        }else{
            answer = 0;
        }

        return answer;
    }
}
