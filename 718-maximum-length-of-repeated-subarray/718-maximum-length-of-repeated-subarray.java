class Solution {

    public int findLength(int[] arr1, int[] arr2) {
        //  similar to longest commom substring;
        int ans = 0;
        int[][] dp = new int[arr1.length + 1][arr2.length + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (arr1[i - 1] == arr2[j - 1]) { // check last element is equal or not in array
                    dp[i][j] = dp[i - 1][j - 1] + 1; // diagonal sum in tabulation
                }
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }
}
// Tc O(n^2)