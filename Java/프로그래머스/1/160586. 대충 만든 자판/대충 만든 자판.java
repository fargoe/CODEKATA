import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        int[] answer = new int[targets.length];
        
        for(int i=0;i<keymap.length;i++){
            for(int j=0;j<keymap[i].length();j++){
                if( map.getOrDefault(keymap[i].charAt(j),101) > j+1 )
                    map.put(keymap[i].charAt(j),j+1);
            }
        }
        
        for(int i=0;i<targets.length;i++){
            int sum=0;
            for(int j=0;j<targets[i].length();j++){
                if( map.getOrDefault(targets[i].charAt(j),0) == 0 ){
                    sum = -1;
                    break;
                }else{
                    sum += map.get(targets[i].charAt(j));
                }
            }
            answer[i] = sum;
        }
        
        
        return answer;
    }
}