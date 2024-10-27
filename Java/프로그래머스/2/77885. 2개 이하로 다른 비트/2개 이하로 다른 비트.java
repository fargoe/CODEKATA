class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            long number = numbers[i];
            
            // 홀수인 경우
            if (number % 2 == 1) {
                long bit = 1;
                // number의 가장 오른쪽에서 0이 나타나는 위치 찾기
                while ((number & bit) != 0) {
                    bit <<= 1;
                }
                answer[i] = number + bit - (bit >> 1);
            } 
            // 짝수인 경우
            else {
                answer[i] = number + 1;
            }
        }
        
        return answer;
    }
}
