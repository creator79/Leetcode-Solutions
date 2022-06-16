class Solution {
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];

    int maxLength = 1;

    int currentLength = 1;

    

    String str = "";

    for (int i=0; i < s.length(); i++) {

        dp[i][i] = true;

    }

    for (int startIdx = s.length()-1; startIdx >=0;  startIdx--) {

        for (int endIdx = startIdx+1; endIdx < s.length(); endIdx++) {

            if (s.charAt(startIdx) == s.charAt(endIdx)) {

                if (endIdx - startIdx == 1 || dp[startIdx+1][endIdx-1]) {

                    dp[startIdx][endIdx] = true;

                    int remainingLen = endIdx - startIdx + 1;

                    currentLength = Math.max(currentLength, remainingLen);

                    

                    if (currentLength > maxLength) {

                        str = s.substring(startIdx, endIdx+1);

                        maxLength = currentLength;

                    }

                }

            }

        }

    }

    

    return str.equals("") ? s.charAt(0)+"" : str;

}
        
    }
