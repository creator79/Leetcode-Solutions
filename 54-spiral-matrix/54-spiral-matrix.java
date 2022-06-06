class Solution {
  public List spiralOrder(int[][] matrix) {
    List ans = new ArrayList();
    int m = matrix.length, n = matrix[0].length;
    int minr = 0;
    int minc = 0;
    int maxr = m - 1;
    int maxc = n - 1;
    int tne = m * n;
    int cnt = 0;
    while (cnt < tne) {
      // top wall
      for (int i = minr, j = minc; j <= maxc && cnt < tne; j++) {
        ans.add(matrix[i][j]);
        cnt++;
      }
      minr++;
      // right wall
      for (int i = minr, j = maxc; i <= maxr && cnt < tne; i++) {
        ans.add(matrix[i][j]);
        cnt++;
      }
      maxc--;
      // bottom wall
      for (int i = maxc, j = maxr; i >= minc && cnt < tne; i--) {
        ans.add(matrix[j][i]);
        cnt++;
      }
      maxr--;
      //left wall
      for (int i = minc, j = maxr; j >= minr && cnt < tne; j--) {
        ans.add(matrix[j][i]);
        cnt++;
      }
      minc++;
    }
    return ans;
  }
}