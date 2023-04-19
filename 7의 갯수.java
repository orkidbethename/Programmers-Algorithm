//[Lv.0] 7의 갯수
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int count = 0;
        
        for(int i=0; i<array.length; i++){
            while(array[i]>0){
                if(array[i]%10 == 7)
                    count++;
                array[i] /= 10;
                System.out.println(count);
            }
        }
        
        answer = count;
        return answer;
    }
}