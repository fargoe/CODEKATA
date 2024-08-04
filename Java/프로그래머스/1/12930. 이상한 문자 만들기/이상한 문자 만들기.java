class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] strArr = s.split("");
        int idx = 0;
        
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(" ")) {
                idx = 1;
            }
            
            answer.append(idx % 2 == 0 ? strArr[i].toUpperCase() : strArr[i].toLowerCase());
            idx++;
        }
        
        return answer.toString();
    }
}