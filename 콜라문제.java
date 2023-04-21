class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int count = 0;
        
        while(n>=a){
            count = (n/a)*b;
            n = (n-((n/a)*a)+count);
            answer += count;
        }
        
        return answer;
    }
}
