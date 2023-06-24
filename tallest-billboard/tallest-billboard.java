class Solution {
    public int tallestBillboard(int[] rods) {
        
    int n = rods.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += rods[i];
        }
        int [][] dp = new int[n + 1][sum + 1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= sum; j++){
                dp[i][j] = -1;
            }
        }
        dp[0][0] = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= sum; j++){
                if(dp[i - 1][j] >= 0){
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                    dp[i][j + rods[i - 1]] = Math.max(dp[i][j + rods[i - 1]], dp[i - 1][j]);
                    dp[i][Math.abs(j - rods[i - 1])] = Math.max(dp[i][Math.abs(j - rods[i - 1])], dp[i - 1][j] + Math.min(j, rods[i - 1]));
                }
            }
        }
        return dp[n][0];
    }
}