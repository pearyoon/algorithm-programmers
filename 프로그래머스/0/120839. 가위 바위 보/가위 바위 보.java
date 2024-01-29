class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for(int i = 0; i < rsp.length(); i++){
            switch(rsp.charAt(i)){
                // 가위
                case '2': answer += "0"; break;
                // 바위
                case '0': answer += "5"; break;
                // 보
                case '5': answer += "2"; break;
            }
                
        }
        
        return answer;
    }
}