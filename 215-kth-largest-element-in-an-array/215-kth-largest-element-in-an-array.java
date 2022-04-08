class Solution {
    public int findKthLargest(int[] nums, int k) {
      // Sort the array
        Arrays.sort(nums);
        
        // Return the kth largest element in the array (which is the length of the array - k after sorting the array)
        return nums[nums.length-k];
        
    }
}