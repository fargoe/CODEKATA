import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        // 1. 숫자를 문자열로 변환
        String[] numStrs = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numStrs[i] = String.valueOf(numbers[i]);
        }
        
        // 2. 정렬 기준 설정 (두 문자열을 합쳤을 때 더 큰 순서)
        Arrays.sort(numStrs, (a, b) -> (b + a).compareTo(a + b));
        
        // 3. 모든 숫자가 0일 경우 0 반환
        if (numStrs[0].equals("0")) {
            return "0";
        }
        
        // 4. 문자열 배열을 하나로 합치기
        StringBuilder answer = new StringBuilder();
        for (String numStr : numStrs) {
            answer.append(numStr);
        }
        
        return answer.toString();
    }
}
