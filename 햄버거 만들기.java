//초안
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        String tmp = "";
        
        for(int i=0; i<ingredient.length; i++){
            tmp += Integer.toString(ingredient[i]);
            if(tmp.contains("1231") == true){
                tmp = tmp.replace("1231","");
                answer++;
            }
        } 
        
        return answer;
    }
}

//시간 단축 수정(stack)
