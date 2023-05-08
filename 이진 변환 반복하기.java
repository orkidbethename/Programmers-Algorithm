class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int counter = 1;
        int zeroCount = 0;
        
        while(true){
            int sLength = s.length();
            s = s.replaceAll("0","");
            zeroCount += sLength - s.length();
            
            s = Integer.toBinaryString(s.length());
            
            if(s.equals("1")){
                answer[0] = counter;
                answer[1] = zeroCount;
                break;
            }
            counter++;
            
            //System.out.println(counter +", " + zeroCount);
        }
        
       
        return answer;
    }
}
