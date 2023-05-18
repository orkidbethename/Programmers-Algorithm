import java.util.*;

class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int[] pos = new int[land.length];

        for(int i=0; i<land.length; i++){
            int max = 0;
            for(int j=0; j<land[i].length; j++){
                if(j==0){
                    max = land[i][j];
                }else if(i == 0){
                    if(land[i][j] >= max){
                        max = land[i][j];
                        pos[i] = j;
                    }
                }else{
                    if(land[i][j] >= max && pos[i-1] != j){
                        max = land[i][j];
                        pos[i] = j;
                    }
                }
            }
            answer += max;
        }

        return answer;
    }
}
