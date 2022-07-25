class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        // Performing binary search on `nums` array
        int ix = Arrays.binarySearch(nums,target);
        if(ix < 0) return new int[]{-1,-1};
        
        int n = nums.length, i = ix, j = ix;
        
        // For first index
        while(i>0 && nums[i-1] == target) i--;
        
        // For last index
        while(j < n-1 && nums[j+1] == target) j++;
        
        return new int[]{i,j};
    }
}