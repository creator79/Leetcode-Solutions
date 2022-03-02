class Solution {
    //TWO POINTER 
    public boolean isSubsequence(String s, String t) {
        int i = 0 , j = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return (i == s.length());
    }
    
    //DP TOP DOWN LCS APPROACH
    public boolean isSubsequence_DP(String s, String t) {
        int n = s.length() , m = t.length();
        int[][] dp = new int[n+1][m+1];
        for(int i = 1; i <= n;i++){
            for(int j = 1; j <= m;j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        // System.out.println(dp[n][m] + " " + dp[n-1][m-1]);
        return dp[n][m] == n;
    }
    
    
    //RECURSIVE SOLUTION
    public boolean isSubsequence_(String s, String t) {
        return solve(s , 0 , t, 0);
    }
    
    private boolean solve(String s , int i , String t, int j){
        if(i == s.length()){
            return true;
        }
        if(i < s.length() && j == t.length()) return false;
        if(s.charAt(i) == t.charAt(j)){
            return solve(s , i+1, t , j+1);
        }else {
            return solve(s , i, t, j+1);
        }
        
    }
}