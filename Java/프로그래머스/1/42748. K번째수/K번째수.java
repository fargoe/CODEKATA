import java.util.Arrays; 

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        
    for (int n = 0; n < commands.length; n++){
        int i = commands[n][0];
        int j = commands[n][1];
        int k = commands[n][2];
        
        int[] slicedArray = Arrays.copyOfRange(array, i -1, j);
        
        Arrays.sort(slicedArray);
        
        result[n] = slicedArray[k -1]; 
        }
        return result;
    }
}