class Solution {
    public int countVowelPermutation(int n) {
      int mod = 1000000007;
long sum = 0;
long[] v = new long[]{1, 1, 1, 1, 1}; // a-0, e-1, i-2, o-3, u-4
for (int i = 1; i < n; i++) {
    long[] v1 = new long[5];
    v1[0] = (v[1] + v[2] + v[4]) % mod;
    v1[1] = (v[0] + v[2]) % mod;
    v1[2] = (v[1] + v[3]) % mod;
    v1[3] = v[2];
    v1[4] = (v[2] + v[3]) % mod;
    v = v1;
}
for (long i : v) 
    sum = (sum + i) % mod;
return (int) sum;  
    }
}