class Solution {
    public int findPairs(int[] nums, int k) {
      HashMap <Integer,Integer>map= new HashMap<>();
      int count =0;
//       iterate over the nums array
      for(int i : nums)
      { 
        map.put(i,map.getOrDefault(i,0)+1);   // map.getOrDefault to make the frequency count in the hashmap shortcut trick
      }
//       traverse through the key in hashmap
      for(int a : map.keySet())
      { 
        if (k!=0)
        {
          int b = a+k;
          if (map.containsKey(b)) count++;
        }
        else 
        { 
//            Case 2  frequency should me more than 2 make the pairs
          if (map.get(a)>=2)count++;
        }
      }
       return count; 
    }
}