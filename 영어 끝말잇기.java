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

// 수정
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public static int[] solution(int n, String[] words) {
        List<String> list = new ArrayList<>();
        int idx = 0;
        list.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (!list.contains(words[i])) {
                String beforeWord = list.get(idx);
                if (beforeWord.charAt(beforeWord.length() - 1) != words[i].charAt(0)) {
                    return fail(n, i);
                }
                idx++;
                list.add(words[i]);
            } else {
                return fail(n, i);
            }
        }

        return new int[] {0, 0};
    }

    private static int[] fail(int n, int i) {
        int order = (i / n) + 1;
        int num = (i % n) + 1;
        return new int[] {num, order};
    }

}
