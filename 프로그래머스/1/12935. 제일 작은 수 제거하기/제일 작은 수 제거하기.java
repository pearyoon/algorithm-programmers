import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length <= 1){
            arr[0] = -1;
            return arr;
        }
        
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        int[] answer = new int[arr.length-1];
        
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != min){
                answer[idx] = arr[i];
                idx++;
            }
        }
        
        return answer;
    }
}