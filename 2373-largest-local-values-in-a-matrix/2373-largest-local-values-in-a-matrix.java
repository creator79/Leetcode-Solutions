class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n-2][n-2];
        for(int i = 1;i < n-1;i++) {
            for(int j = 1;j < n-1;j++) {
                int lc = j-1,rc = j+1,ur = i-1,lr = i+1;
                ans[i-1][j-1] = getMax(ur,lr,lc,rc,grid);
            }
        }
        return ans;
        
    }
    int  getMax (int r1,int r2,int c1,int c2,int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = r1;i <= r2;i++) {
            for(int j = c1;j <= c2;j++) {
                max = Math.max(max,arr[i][j]);
            }
        }
        return max;
    
        
    }
}