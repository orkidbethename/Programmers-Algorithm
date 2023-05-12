class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        for(int i=0; i<phone_book.length; i++){
            for(int j=0; j<phone_book.length; j++){
                if(j == i){
                    continue;
                }else{
                    if(phone_book[i].length()<= phone_book[j].length() && phone_book[j].substring(0,phone_book[i].length()).equals(phone_book[i])){
                        answer = false;
                        break;
                    }
                }
                
            }
        }
        return answer;
    }
}
