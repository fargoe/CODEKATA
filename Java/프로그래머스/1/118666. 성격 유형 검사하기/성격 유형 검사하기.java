import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character,Integer> scoreMap = new HashMap<>();
        
        scoreMap.put('R',0);
        scoreMap.put('T',0);
        scoreMap.put('C',0);
        scoreMap.put('F',0);
        scoreMap.put('J',0);
        scoreMap.put('M',0);
        scoreMap.put('A',0);
        scoreMap.put('N',0);
        
        for(int i = 0; i < survey.length; i++){
            String type = survey[i];
            int choice = choices[i];
            
            char disagreeType = type.charAt(0);
            char agreeType = type.charAt(1);
            
            if (choice <= 3) {
                scoreMap.put(disagreeType, scoreMap.get(disagreeType) + (4-choice));
            } else if (choice >= 5) {
                scoreMap.put(agreeType, scoreMap.get(agreeType) + (choice -4));
            }
        }
        
         StringBuilder result = new StringBuilder();
        result.append(scoreMap.get('R') >= scoreMap.get('T') ? 'R' : 'T');
        result.append(scoreMap.get('C') >= scoreMap.get('F') ? 'C' : 'F');
        result.append(scoreMap.get('J') >= scoreMap.get('M') ? 'J' : 'M');
        result.append(scoreMap.get('A') >= scoreMap.get('N') ? 'A' : 'N');

        return result.toString();
    }
}
