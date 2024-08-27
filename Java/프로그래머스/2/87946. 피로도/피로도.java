class Solution {

    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        return DFS(k, dungeons, visited, 0);
    }

    int DFS(int remain, int[][] dungeons, boolean[] visited, int depth) {
        int maxDepth = depth;

        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i] || remain < dungeons[i][0]) {
                continue;
            }
            visited[i] = true;
            maxDepth = Math.max(maxDepth, DFS(remain - dungeons[i][1], dungeons, visited, depth + 1));
            visited[i] = false;
        }

        return maxDepth;
    }
}