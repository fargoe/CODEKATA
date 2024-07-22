class Solution {
    public long solution(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return (long)(max - min + 1) * (min + max) / 2;
    }
}