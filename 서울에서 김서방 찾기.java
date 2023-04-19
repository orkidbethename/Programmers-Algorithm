//[Lv.1] 서울에서 김서방 찾기
class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int num = 0;
        
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                num = i;
                System.out.println(num);
                break;
            }
        }
        
        
        answer = "김서방은 "+num+"에 있다";
        
        return answer;
    }
}