class Solution {
      public int numFactoredBinaryTrees(int[] arr) {
        HashMap<Integer, Long> map = new HashMap<>();
        Arrays.sort(arr);
        long n = arr.length, mod = 1_000_000_007, res = 0;
        for(int i = 0; i < n; i++){
            long tmp = 1L;
            for(int j = 0; j < i; j++){
                if(arr[i] % arr[j] == 0 && map.containsKey(arr[i] / arr[j])){
                    tmp = (tmp + (map.get(arr[j]) % mod)* (map.get(arr[i] / arr[j]) % mod)) % mod;
                }
            }
            map.put(arr[i], tmp);
            res = (res + tmp) % mod;
        }
        return (int) res;
    }
}