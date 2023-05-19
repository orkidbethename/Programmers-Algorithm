class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for(int i=1; i<n; i++){
            int num = i;
            int sum = 0;
            while(true){
                sum += num;
                if(sum == n){
                    answer++;
                    break;
                }else if(sum>n){
                    break;
                }
                num++;
            }
        }
        return answer;
    }
}
