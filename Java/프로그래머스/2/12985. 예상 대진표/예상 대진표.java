class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;

        // 두 플레이어가 만날 때까지 계속 반복
        while (a != b) {
            // a와 b를 다음 라운드 번호로 변환
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;  // 라운드 수 증가
        }

        return answer;  // 만나는 라운드 번호를 반환
    }
}