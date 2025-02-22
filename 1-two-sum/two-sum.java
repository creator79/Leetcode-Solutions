class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Optimised Approach

        // step 1 :- decalre hashmap Integer , Integer
        // step 2 :- put value in hashmap index and diff
        // step 3 :- diff = target - num[i] , check value present is hashmap then
        // current index and hashmap index else add the value in hashmap

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { 0, 0 };
    }

}