class Solution {
    public int[] solution(String[] park, String[] routes) {
        int height = park.length;
        int width = park[0].length();
        int[] position = new int[2];
        
        for(int i = 0; i < height; i++) {
            if (park[i].contains("S")){
                position[0] = i;
                position[1] = park[i].indexOf("S");
                break;
            }
        }
        
        for (String route : routes) {
            String[] parts  = route.split(" ");
            String direction = parts[0];
            int steps = Integer.parseInt(parts[1]);
            
            if(canMove(park, position, direction, steps)) {
                move(position, direction, steps);
            }
        }
        return position;
    }
        
        private boolean canMove(String[] park, int[] position, String direction, int steps) {
            int y = position[0];
            int x = position[1];
            
            for(int i = 1; i <= steps; i++) {
                switch (direction) {
                    case "N" : y--; break;
                    case "S" : y++; break;
                    case "W" : x--; break;
                    case "E" : x++; break;
                }
                
                if (y < 0 || y >= park.length || x < 0 || x >= park[0].length() || park[y].charAt(x) == 'X') {
                    return false;
                }
            }
            return true;
        }
        
        private void move(int[] position, String direction, int steps) {
            switch (direction) {
                case "N" : position[0] -= steps; break;
                case "S" : position[0] += steps; break;
                case "W" : position[1] -= steps; break;
                case "E" : position[1] += steps; break;
            }
        }
    }
