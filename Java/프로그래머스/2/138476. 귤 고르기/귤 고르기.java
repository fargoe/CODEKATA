import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        // 각 귤의 크기별로 몇 개 있는지 카운팅하는 맵 생성
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // 각 귤 크기를 순회하면서 개수 카운팅
        for (int size : tangerine) {
            countMap.put(size, countMap.getOrDefault(size, 0) + 1);
        }

        // 귤 크기별 개수를 내림차순으로 정렬하기 위해 리스트로 변환
        List<Integer> countList = new ArrayList<>(countMap.values());
        Collections.sort(countList, Collections.reverseOrder());
        
        int total = 0;
        int answer = 0;

        // 가장 많은 귤 크기부터 선택하여 k개를 채울 때까지 반복
        for (int count : countList) {
            total += count;
            answer++;
            if (total >= k) {
                break;
            }
        }
        
        return answer;
    }
}