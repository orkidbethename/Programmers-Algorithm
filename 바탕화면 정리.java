import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        List<Integer> column = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    column.add(j);
                    row.add(i);
                }
            }
        }
        
        row.sort(Comparator.naturalOrder());
        column.sort(Comparator.naturalOrder());
        
        answer[0] = row.get(0);
        answer[1] = column.get(0);
        answer[2] = row.get(row.size()-1)+1;
        answer[3] = column.get(column.size()-1)+1;
        
        
        return answer;
    }
}
