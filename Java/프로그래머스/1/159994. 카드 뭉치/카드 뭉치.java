public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int pointer1 = 0;
        int pointer2 = 0;

        for (String word : goal) {
            if (pointer1 < cards1.length && word.equals(cards1[pointer1])) {
                pointer1++;
            } else if (pointer2 < cards2.length && word.equals(cards2[pointer2])) {
                pointer2++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
