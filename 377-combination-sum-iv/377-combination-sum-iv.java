class Solution {

    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, -1);

        return solve(nums, target, dp);
    }

    public int solve(int[] num, int tar, int[] dp) {
        if (tar < 0 )  return 0;
        if (tar == 0)  return 1;
        if (dp[tar] != -1) {
            return dp[tar];
        }
        
        int ans = 0;
        for (int i = 0; i < num.length; i++) {
            ans += solve(num, tar - num[i],dp);
            dp[tar] = ans;
        }

        return dp[tar];
    }
}
