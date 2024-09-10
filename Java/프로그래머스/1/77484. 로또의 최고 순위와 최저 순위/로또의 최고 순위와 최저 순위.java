import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        
        Set<Integer> winSet = new HashSet<>();
        for (int num : win_nums) {
            winSet.add(num);
        }
        
        int zeroCount = 0;
        int matchCount = 0;
        
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
            } else if (winSet.contains(lotto)) {
                matchCount++;
            }
        }
        
        int maxRank = rank[matchCount + zeroCount];
        int minRank = rank[matchCount];

        return new int[]{maxRank, minRank};
    }
}
