class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(48 <= c && c <= 57){
                answer += c - '0';
            }
        }
        
        return answer;
    }
}