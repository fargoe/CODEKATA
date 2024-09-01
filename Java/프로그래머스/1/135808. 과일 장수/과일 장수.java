import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        
        int maxProfit = 0;
        
        for(int i = score.length -m; i >= 0; i -= m) {
            int minScore = score[i];
            maxProfit += minScore * m;
        }
        
        return maxProfit;
    }
}