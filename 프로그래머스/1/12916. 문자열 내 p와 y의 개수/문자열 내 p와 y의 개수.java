class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int pNum = 0;
        int yNum = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                pNum++;
            } else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                yNum++;
            }
        }
        
        if(yNum != pNum){
            answer = false;
        }

        return answer;
    }
}