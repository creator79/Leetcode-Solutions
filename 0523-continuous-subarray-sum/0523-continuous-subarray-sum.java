// Use a map to store the prefix sum and their index. So that we can access it all the previous prefix sum stored.
// Start iterating the nums array and put the sum % k to map's key and current index as value.
// If the map already contains the sum and difference between indices is gretaer than 1 then we have our answer return true.
// We have one more situation which is if our sum % k becomes zero and index diffrenece is greater then 1 then this is also a valid answer return true.
class Solution {

    public boolean checkSubarraySum(int[] nums, int k) {
        // Initialize the map
        Map<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            // Prefix sum which will have sum of all previous elements.
            prefixSum += nums[i];

            // Mod by k
            prefixSum %= k;

            // If our prefixSum becomes 0 at any point for index gretaer than 0 the return true.
            if (prefixSum == 0 && i > 0) {
                return true;
            }

            // If prefixSum is already there in map and the difference between current index and that index gretaer than 1.
            if (map.containsKey(prefixSum) && i - map.get(prefixSum) > 1) {
                return true;
            }

            // At last put the prefixSum and the current in the map.
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        // Return false if no such subarray is found.
        return false;
    }
}
