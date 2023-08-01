class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int first = 0;
        int second = 0;
        int third = 0;
        
        for(int x=0; x<number.length-2; x++){
            first = number[x];
            for(int y=x+1;y<number.length-1; y++){
                second = number[y];
                for(int z=y+1; z<number.length; z++){
                    third = number[z];
                    if(first+second+third == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
