class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }
    
    private int dfs(int[] numbers, int target, int index, int currentSum) {
        if(index == numbers.length) {
            if(currentSum == target) {
                return 1;
            } else {
                return 0;
            }
        }
        
        int add = dfs(numbers, target, index + 1, currentSum + numbers[index]);
        int subtract = dfs(numbers, target, index + 1, currentSum - numbers[index]);
        
        return add + subtract; 
    }
}

