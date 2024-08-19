import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
    
        int hIndex = 0;
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            if(citations[i] >= h) {
                hIndex = h;
                break;
            }
        }
        return hIndex;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] citations = {3, 5};
        int result = sol.solution(citations);
        System.out.println("H-Index: " + result);  // 출력: H-Index: 3
    }
}