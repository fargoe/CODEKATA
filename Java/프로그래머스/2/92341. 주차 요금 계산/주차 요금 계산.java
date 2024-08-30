import java.util.*;

public class Solution {

    public int[] solution(int[] fees, String[] records) {
        TreeMap<String, Integer> parkingTime = new TreeMap<>();
        Map<String, Integer> inTime = new HashMap<>();

        for (String record : records) {
            String[] parts = record.split(" ");
            String timeStr = parts[0];
            String carNumber = parts[1];
            int time = timeToMinutes(timeStr);

            if (parts[2].equals("IN")) {
                inTime.put(carNumber, time);
            } else {
                int parkedTime = time - inTime.remove(carNumber);
                parkingTime.put(carNumber, parkingTime.getOrDefault(carNumber, 0) + parkedTime);
            }
        }

        // 입차만 하고 출차 기록이 없는 차량 처리
        for (String carNumber : inTime.keySet()) {
            int parkedTime = 1439 - inTime.get(carNumber); // 23:59에 출차된 것으로 간주
            parkingTime.put(carNumber, parkingTime.getOrDefault(carNumber, 0) + parkedTime);
        }

        // 차량 번호 순서대로 주차 요금 계산
        int[] result = new int[parkingTime.size()];
        int index = 0;
        for (Map.Entry<String, Integer> entry : parkingTime.entrySet()) {
            result[index++] = calculateFee(entry.getValue(), fees);
        }

        return result;
    }

    private int timeToMinutes(String timeStr) {
        String[] parts = timeStr.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    private int calculateFee(int time, int[] fees) {
        if (time <= fees[0]) return fees[1];
        return fees[1] + (int) Math.ceil((double) (time - fees[0]) / fees[2]) * fees[3];
    }

}