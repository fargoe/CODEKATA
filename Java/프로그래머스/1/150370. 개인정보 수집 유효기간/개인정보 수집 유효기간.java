import java.util.*;

class Solution {
    // 날짜를 일 단위로 변환하는 메서드
    private int convertDateToDays(String date) {
        String[] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }

    public int[] solution(String today, String[] terms, String[] privacies) {
        // 약관 종류와 유효기간을 저장할 HashMap
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] parts = term.split(" ");
            termMap.put(parts[0], Integer.parseInt(parts[1]));
        }

        // 오늘 날짜를 일 단위로 변환
        int todayInDays = convertDateToDays(today);
        List<Integer> expiredPrivacyList = new ArrayList<>();

        // 각 개인정보의 유효기간을 계산하고 파기 여부 판단
        for (int i = 0; i < privacies.length; i++) {
            String[] privacyParts = privacies[i].split(" ");
            String collectedDate = privacyParts[0];
            String termType = privacyParts[1];

            int collectedDateInDays = convertDateToDays(collectedDate);
            int expirationDays = termMap.get(termType) * 28;

            // 만료일을 계산하고, 오늘 날짜와 비교
            if (collectedDateInDays + expirationDays <= todayInDays) {
                expiredPrivacyList.add(i + 1); // 개인정보 번호는 1부터 시작하므로 i + 1
            }
        }

        // 결과를 배열로 변환
        int[] answer = new int[expiredPrivacyList.size()];
        for (int i = 0; i < expiredPrivacyList.size(); i++) {
            answer[i] = expiredPrivacyList.get(i);
        }

        return answer;
    }
}
