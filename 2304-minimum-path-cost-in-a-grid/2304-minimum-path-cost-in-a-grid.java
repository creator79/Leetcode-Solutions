class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int i=0;i<grid[0].length;i++){
            dp[0][i]=grid[0][i];
        }
        for(int i=1;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int min=Integer.MAX_VALUE;
                for(int k=0;k<grid[0].length;k++){
                    min = Math.min(min,dp[i-1][k]+moveCost[grid[i-1][k]][j]+grid[i][j]);
                }
                dp[i][j]=min;
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++){
            ans = Math.min(ans,dp[grid.length-1][i]);
        }
        return ans;
    }
}