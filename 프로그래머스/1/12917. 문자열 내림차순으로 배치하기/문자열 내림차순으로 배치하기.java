import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String sortedString = new String(arr);
        String reversedString = new StringBuilder(sortedString).reverse().toString();
        return reversedString;
    }
}