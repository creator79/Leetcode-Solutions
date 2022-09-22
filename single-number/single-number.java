class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i=0;i<nums.length;i++){
              // map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
            
            
        }
        Set<Map.Entry<Integer,Integer>> s = mp.entrySet();
          
        for (Map.Entry<Integer, Integer> it: s)
        {
          if (it.getValue()==1){
                return it.getKey();
          }
        }
        return -1;
    }
}