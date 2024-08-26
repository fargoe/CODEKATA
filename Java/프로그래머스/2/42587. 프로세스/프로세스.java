import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < priorities.length; i++) {
            list.add(new int[]{priorities[i], i});
        }

        int order = 0;

        while (!list.isEmpty()) {
            int[] current = list.remove(0);

            boolean hasHigherPriority = false;
            for (int[] item : list) {
                if (item[0] > current[0]) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                list.add(current);
            } else {
                order++;
                if (current[1] == location) {
                    return order;
                }
            }
        }

        return -1;
    }
}