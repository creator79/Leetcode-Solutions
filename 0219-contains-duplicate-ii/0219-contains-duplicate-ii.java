class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
       // make a hashmap
      //  use array value as key and index as value
      //  if key is already present in hashmap
      //  check if the difference between the index of the current element and the index of the element in the hashmap is less than k
      //  if yes return true
      //  else update the index of the element in the hashmap
      //  if no return false
      HashMap<Integer, Integer> map = new HashMap<>();
      for(int i = 0; i < nums.length; i++){
         if(map.containsKey(nums[i])){
            if(i - map.get(nums[i]) <= k){
               return true;
            }
            else{
               map.put(nums[i], i);
            }
         }
         else{
            map.put(nums[i], i);
         }
      }
      return false;
    }
}
