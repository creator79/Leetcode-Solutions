class Solution {
    public int maxProfit(int k, int[] prices) {
        if(prices==null || prices.length==0) return 0;
        
        int dp[][]=new int [k+1][prices.length];
        
    for(int i=0;i<dp.length;i++){
        int max=Integer.MIN_VALUE;
        for(int j=0;j<dp[0].length;j++){
                if(i==0 || j==0) continue;
                else{
                    max=Math.max(max,dp[i-1][j-1]-prices[j-1]);
                    if(max+prices[j]>dp[i][j-1]) dp[i][j]=max+prices[j];
                    else dp[i][j]=dp[i][j-1];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}