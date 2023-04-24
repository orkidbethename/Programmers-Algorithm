import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[][] stackArr = new int[board.length][board.length];
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                stackArr[i][j] = board[j][i];
            }
            //System.out.println(Arrays.toString(stackArr[i]));
        }

        Stack<Integer> crane = new Stack<>();
        for(int i=0; i<moves.length; i++){
            int num = moves[i]-1;
            int pre;
            for(int j=0; j<stackArr.length; j++){
                if(stackArr[num][j] != 0){
                    crane.push(stackArr[num][j]);
                    stackArr[num][j] = 0;
                    break;
                }
            }
            
            if(crane.size()>1 && crane.get(crane.size()-2) == crane.get(crane.size()-1)){
                crane.pop();
                crane.pop();
                answer += 2;
            }
            //System.out.println(crane);
        }
        
        
        return answer;
    }
}
