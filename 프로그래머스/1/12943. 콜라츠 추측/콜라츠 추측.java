class Solution {
    public int solution(int num) {
        long number = num;
        int steps;

        for (steps = 0; steps < 500; steps++) {
            if (number == 1) {
                return steps;
            }

            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = number * 3 + 1;
            }
        } 
        return -1;
    }
}