import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) return new int[]{-1};
        
        int minValue = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != minValue).toArray();
    }
}