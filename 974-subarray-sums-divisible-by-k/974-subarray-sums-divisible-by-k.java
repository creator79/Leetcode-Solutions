class Solution {
    public int subarraysDivByK(int[] a, int k) {
        int ans=0;
        Map<Integer,Integer> map = new HashMap<>();
//         agar phele do values subarray bna rahe hai toh unhe ans me consider karne ke liye and ye special case bhi hai ye
        map.put(0,1);
        int sum=0;
        int rem=0;
        // yaha pe a[i] likne pe tle de raha raha index bound due to for each loop
        for(int i:a){
            sum+=i;
            rem = sum%k;
//             if remainder is negative 
            if(rem<0){
                rem+=k;
                
            }
            if(map.containsKey(rem)){
                ans+=map.get(rem);
                map.put(rem,map.get(rem)+1);
            
            }
            else{
                map.put(rem,1);
            }
        }
        return ans;
    }
}