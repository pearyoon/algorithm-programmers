class Solution {
    public int[] solution(long n) {
        String s = "" + n;
        int[] answer = new int[s.length()];
        
        for(int i = s.length() - 1; i >= 0; i--){
            answer[s.length() - 1 - i] = s.charAt(i) - 48;
        }
        
        return answer;
    }
}