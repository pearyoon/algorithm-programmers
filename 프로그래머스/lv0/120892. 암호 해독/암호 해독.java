class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int cnt = 1;
        for(int i = 0; i < cipher.length(); i++) {
            char ch = cipher.charAt(i);
            if(cnt%code == 0){
                answer += ch;
            }
            cnt++;
        }
        return answer;
    }
}