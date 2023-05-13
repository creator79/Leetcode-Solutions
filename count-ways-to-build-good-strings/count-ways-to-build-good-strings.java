class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
         long[] res = new long[200005];
                 Set<Integer> st = new HashSet<>();
                 for (int i = 0; i < 10; i++) {
                     st.add(i);
                 }
                 long modii = 1000000007;
                 res[0] = 1;
                 for (int i = 0; i < 100005; i++) {
                     res[i + zero] %= modii;
                     res[i + zero] += res[i];
                     res[i + one] %= modii;
                     res[i + one] += res[i];
                 }
                 long temp = 0;
                 for (int i = low; i <= high; i++) {
                     temp = (temp + res[i]) % modii;
                 }
                 return (int) temp;
        

    }
}