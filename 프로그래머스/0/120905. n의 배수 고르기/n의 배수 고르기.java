class Solution {
    public int[] solution(int n, int[] numlist) {
        int size = 0;
        
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
               size++; 
            }
        }
        
        int[] answer = new int[size];
        int len = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                answer[len] = numlist[i];
                len++;
            }
        }
        return answer;
    }
}