class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        String mask = "*".repeat(length - 4); 
        String substr = phone_number.substring(length - 4); 
        return mask + substr; 
    }
}