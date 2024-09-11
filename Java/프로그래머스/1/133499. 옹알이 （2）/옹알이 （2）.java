class Solution {
    public int solution(String[] babbling) {
        String[] possible = {"aya", "ye", "woo", "ma"};
        
        int count = 0;
        
        for(String word : babbling) {
            String temp = word;
            
            String last = "";
            
            boolean isValid = true;
            
            while (temp.length() > 0) {
                boolean matched = false;
                
                for(String sound : possible) {
                    if (temp.startsWith(sound)) {
                        if (sound.equals(last)) {
                            isValid = false;
                            break;
                        }
                        temp = temp.substring(sound.length());
                        last = sound;
                        matched = true;
                        break;
                    }
                }
                
                if(!matched) {
                    isValid = false;
                    break;
                }
            }
            if(isValid) {
                count++;
            }
        }
        return count;
    }
}