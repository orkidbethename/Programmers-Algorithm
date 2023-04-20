import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int count = 0;
        HashMap<String,String> map = new HashMap<>();
        
        for(int i=0; i<name.length; i++){
            map.put(name[i],Integer.toString(yearning[i]));
        }
        
        
        for(int i=0;i<photo.length; i++){
            for(int j=0; j<photo[i].length; j++){
                if(map.get(photo[i][j]) != null){
                    count += Integer.parseInt(map.get(photo[i][j]));
                }
            }
            System.out.println(count);
            answer[i] = count;
            count = 0;
        }
        
        return answer;
    }
}
