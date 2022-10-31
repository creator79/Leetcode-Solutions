class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
 
                 if (i + 1 < r && j + 1 < c && matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false; 
                }
            }
        }
        // System.out.println("");
        return true;
    }
}