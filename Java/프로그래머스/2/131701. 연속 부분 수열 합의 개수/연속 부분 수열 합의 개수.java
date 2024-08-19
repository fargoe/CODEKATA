import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static int solution(int[] elements) {
        Set<Integer> sums = new HashSet<>();
        int n = elements.length;
        
        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = 0; j < n; j++) {
                sum += elements[(i + j) % n]; 
                sums.add(sum);
            }
        }

        return sums.size();
    }

}
