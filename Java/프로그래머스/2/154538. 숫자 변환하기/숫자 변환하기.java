class Solution {
    private static int[] dp;
    public static final int MAX_VALUE = Integer.MAX_VALUE;

    public int solution(int x, int y, int n) {
        dp = new int[y + 1];
        for (int i = x + 1; i <= y; i++) {
            int a = i - n >= x ? dp[i - n] : MAX_VALUE; //더하기 연산 사용한 경우
            int b = i / 2 >= x && i % 2 == 0 ? dp[i / 2] : MAX_VALUE; // 2를 곱한 경우
            int c = i / 3 >= x && i % 3 == 0 ? dp[i / 3] : MAX_VALUE; //3을 곱한경우

            int d = Math.min(a, b);
            d = Math.min(d, c);

            dp[i] = (d < MAX_VALUE) ? d + 1 : MAX_VALUE;
        }
        return dp[y] < MAX_VALUE ? dp[y] : -1;
    }
}