class Solution {
    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcm = lcm(n, m, gcd);
        
        int[] answer = {gcd, lcm};
        return answer;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    private int lcm(int a, int b, int gcd) {
        return a * b / gcd;
    }
}