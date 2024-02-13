class Solution {
    public String solution(String phone_number) {
        String star = "";
        int idx = phone_number.length();
        
        for(int i = 0; i < idx-4; i++){
            star += "*";
        }
        
        return star + phone_number.substring(idx-4, idx);
    }
}