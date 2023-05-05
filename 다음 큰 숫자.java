class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        int count2 = 0;
        
        count = Integer.bitCount(n);
        //System.out.println(count);
        
        while(true){
            n++;
            count2 = Integer.bitCount(n);
            if(count2 == count){
                break;
            }
        }
        return n;
    }
}
