import java.util.*;

class Solution {
    public long solution(long n) {
        char[] input = Long.toString(n).toCharArray();
        Arrays.sort(input);
        long ans = 0;
        for(int i = input.length - 1; i >= 0; i--) {
            ans = ans * 10 + (input[i] - '0');
        }
        return ans;
    }
}