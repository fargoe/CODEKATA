import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        int idx = 0;
        int n = order.length;
        
        for(int i = 1; i <= n; i++) {
            stack.push(i);
            while(!stack.isEmpty() && stack.peek() == order[idx]) {
                stack.pop();
                idx++;
            }
        }
        return idx;
    
    }
}