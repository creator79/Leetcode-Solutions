//Convert recursion to iteration
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int t[]=new int[n];
        for(int i=0;i<n;i++){
            if(i<2) t[i]=cost[i];
            else t[i]=Math.min(t[i-1],t[i-2])+cost[i];
        }
        return Math.min(t[n-1],t[n-2]);
    }
}