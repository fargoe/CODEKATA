import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] arr, int divisor) {
        int[] result = Arrays.stream(arr)
                             .filter(num -> num % divisor == 0)
                             .sorted()
                             .toArray();

        if (result.length == 0) {
            return new int[]{-1};
        }

        return result;
    }
}