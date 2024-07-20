public class Solution {
    public int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(12)); 
        System.out.println(sol.solution(5));
    }
}