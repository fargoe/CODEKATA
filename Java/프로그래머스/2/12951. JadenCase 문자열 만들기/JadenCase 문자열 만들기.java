public class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        boolean isNextUpper = true; // 첫 문자는 대문자로 처리하기 위한 플래그

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                result.append(c);
                isNextUpper = true; // 공백 이후의 첫 문자는 대문자로 처리
            } else if (isNextUpper) {
                result.append(Character.toUpperCase(c));
                isNextUpper = false;
            } else {
                result.append(Character.toLowerCase(c));
            }
        }

        return result.toString();
    }
}