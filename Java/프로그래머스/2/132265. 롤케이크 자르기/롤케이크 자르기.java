import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] topping) {
        int n = topping.length;
        
        int[] leftCounts = new int[n];
        int[] rightCounts = new int[n];
        
        Set<Integer> leftSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            leftSet.add(topping[i]);
            leftCounts[i] = leftSet.size();
        }
        
        Set<Integer> rightSet = new HashSet<>();
        for (int i = n - 1; i >= 0; i--) {
            rightSet.add(topping[i]);
            rightCounts[i] = rightSet.size();
        }
        
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (leftCounts[i] == rightCounts[i + 1]) {
                count++;
            }
        }
        
        return count;
    }
}
