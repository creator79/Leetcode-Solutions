class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0) +1);
        }
        
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
          
            if(e.getValue() > 1)
            {
            return e.getKey();
            }
        }
        return -1;
    }
}