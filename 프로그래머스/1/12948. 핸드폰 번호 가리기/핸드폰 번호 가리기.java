class Solution {
    public String solution(String phone_number) {
        String star = "";
        
        for(int i = 0; i < phone_number.length()-4; i++){
            star += "*";
        }
        
        return star + phone_number.substring(phone_number.length()-4);
    }
}