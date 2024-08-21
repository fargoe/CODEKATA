class Solution {
    public int[] solution(int n, long left, long right) {
        int size = (int)(right - left + 1);
        int[] result = new int[size];
        
        for(long index = left; index <= right; index++){
            int row = (int)(index / n);
            int col = (int)(index % n);
            result[(int)(index - left)] = Math.max(row, col) + 1;
        }
        return result;
    }
}