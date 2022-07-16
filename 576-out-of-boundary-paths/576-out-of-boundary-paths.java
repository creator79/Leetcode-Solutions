class Solution {
    private int mod = 1000000000+7;
    
    public int findPaths(int m, int n, int N, int i, int j){
        Long dp[][][] = new Long[m][n][N+1];
        
        return (int) (findPaths(m, n, N, i, j, dp) % mod);
    }
    
    public long findPaths(int m, int n, int N, int i, int j,Long[][][] dp) {
        if (i == m || j == n || i < 0 || j < 0) return 1;
        
        if (N == 0) return 0;
        
        if(dp[i][j][N] != null)
            return dp[i][j][N];
        
        long up = findPaths(m, n, N - 1, i - 1, j,dp);
        long down = findPaths(m, n, N - 1, i + 1, j,dp);
        long left = findPaths(m, n, N - 1, i, j - 1,dp);
        long right = findPaths(m, n, N - 1, i, j + 1,dp);
        
        dp[i][j][N] = (up + down + left + right) % mod;
        return dp[i][j][N];
    }
    
}