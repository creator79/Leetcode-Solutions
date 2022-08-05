class Solution {
public int combinationSum4(int[] n, int t) {
int dp[]=new int[t+1];
Arrays.fill(dp,-1);
return task(n,t,dp);
}
public int task(int n[], int t, int dp[])
{
if(t<0)
{
return 0;
}
if(t==0)
{
return 1;
}
if(dp[t]!=-1)
{
return dp[t];
}
int s=0;
for(int i=0;i<n.length;i++)
{
s+=task(n,t-n[i],dp);
}
dp[t]=s;
return dp[t];
}
}