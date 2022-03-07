class Solution {
    public int countOrders(int n) {
        long[] dp = new long[501];
        int mod = 1000000007;
        dp[1] = 1L;
        dp[2] = 6L;
        for (int i = 3; i <= n; i++){
            int num = 2 * i -1;
            int perm = num*(num+1)/2;
            dp[i] = (dp[i-1] * perm) % mod;
        }
        return (int)dp[n];
    }
}