import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String s = "" + n;
        int[] nArr = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            nArr[i] = s.charAt(i) - 48;
        }
        
        Arrays.sort(nArr);
        long answer = 0;
        
        for(int i = nArr.length-1; i >= 0; i--){
            answer = answer * 10 + nArr[i];
        }
        
        return answer;
    }
}