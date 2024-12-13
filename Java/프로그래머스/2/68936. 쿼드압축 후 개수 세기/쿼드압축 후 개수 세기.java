class Solution {
    private int zeroCount = 0; // 0의 개수를 저장
    private int oneCount = 0;  // 1의 개수를 저장

    public int[] solution(int[][] arr) {
        int n = arr.length;
        compress(arr, 0, 0, n); // 0,0부터 n x n 영역 시작
        return new int[]{zeroCount, oneCount};
    }

    private void compress(int[][] arr, int row, int col, int size) {
        // 현재 영역이 모두 같은 값인지 확인
        if (isUniform(arr, row, col, size)) {
            if (arr[row][col] == 0) {
                zeroCount++;
            } else {
                oneCount++;
            }
            return; // 압축했으므로 더 이상 탐색하지 않음
        }

        // 네 개의 영역으로 분할
        int newSize = size / 2;
        compress(arr, row, col, newSize);             // 왼쪽 위
        compress(arr, row, col + newSize, newSize);  // 오른쪽 위
        compress(arr, row + newSize, col, newSize);  // 왼쪽 아래
        compress(arr, row + newSize, col + newSize, newSize); // 오른쪽 아래
    }

    private boolean isUniform(int[][] arr, int row, int col, int size) {
        int value = arr[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (arr[i][j] != value) {
                    return false;
                }
            }
        }
        return true;
    }
}
