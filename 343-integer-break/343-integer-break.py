class Solution:
    def integerBreak(self, n: int) -> int:
        
        if n < 2: return n
        if n == 2: return 1
        dp = [0, 1, 2] + [1] * (n-2)
        for i in range(1, n+1):
            for j in range(1, i):
                dp[i] = max([j*dp[i-j], j*(i-j), dp[i]])
        return dp[-1]
        