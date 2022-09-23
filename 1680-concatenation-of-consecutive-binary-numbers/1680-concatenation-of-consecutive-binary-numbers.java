class Solution {

    //    Brute  Apporach  (still not worked )
    // 1--> Use Recursion to make 3 to (int type )"123";
    // 2--> find binary digit by digit ;
    // 3--> after that convert it into decimal and return the ans ;

    public int concatenatedBinary(int n) {
        // (preety Intelligent ans )
       int mod = 1000000007;
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            int len = (int) (Math.log(i) / Math.log(2)) + 1; // good point 
            ans = ((ans << len) % mod + i) % mod;
        }
        return (int) ans;
    }
}
