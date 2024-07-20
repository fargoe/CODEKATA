class Solution {
    public int solution(int[] numbers){
        final int TOTAL_SUM = 45;
        int sum = TOTAL_SUM;
        
        for(int i = 0; i < numbers.length; i++){
            sum -= numbers[i];
        }
    return sum;
    }
}