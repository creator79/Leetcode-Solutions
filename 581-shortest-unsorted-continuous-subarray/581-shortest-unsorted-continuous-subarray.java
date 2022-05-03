class Solution {
    public int findUnsortedSubarray(int[] nums) {

        if(nums == null || nums.length == 0 || nums.length == 1) return 0;
		
		int n = nums.length;
		int size = n;
        int[] temp = Arrays.copyOf(nums, n);
        Arrays.sort(temp);
        
        int low = 0, high = n - 1;
        
        while(low < n && temp[low] == nums[low]) low++;
        
        if(low == n) return 0;
        
        while(high >= 0 && temp[high] == nums[high]) high--;
        
        return high - low + 1;
    }
}