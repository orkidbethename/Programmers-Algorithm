import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int counter = 1;
        List<String> list = Arrays.asList(words);
        Set<String> set = new HashSet<>(list);
        
        for(int i=0; i<words.length-1; i++){
            if(words[i].charAt(words[i].length()-1) == words[i+1].charAt(0)){
                counter++;
            }else{
                counter++;
                break;
            }
        }
        
        answer[0] = (counter-1)%n+1;
        answer[1] = (counter+1)/n;
        
        if(counter == words.length && set.size() == list.size()){
            answer[0] = 0;
            answer[1] = 0;
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다. 
        System.out.println(counter);

        return answer;
    }
}
