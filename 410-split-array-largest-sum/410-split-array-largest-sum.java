// We need to minimize the largest sum such that it contains at most m continuous subarrays.
// Let's Binary Search the answer.
// Consider mid be the largest sum possible.
// Then, all the possible subarrays must have a sum less than or equal to mid.
// So, check if for a given mid, if we have at most m subarrays possible such that each subarray has sum at most mid, then check for a smaller answer, otherwise, check for larger answer.
class Solution {
    public int splitArray(int[] nums, int m) {
        int low = 0,high=0;
        for(int i:nums)
        {
            low = Math.max(low,i);
            high += i;
        }
        
        while(low <= high)
        {
            int mid = low + (high-low)/2;
            if(isPossible(nums,m,mid))
            {
                high = mid-1;
            }
            else    low = mid+1;
        }
        return low;
    }
    boolean isPossible(int[] nums,int m,int limit)
    {
        int count = 1,sum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            if(sum > limit)
            {
                count++;
                sum = nums[i];
                if(count > m)
                    return false;
            }
        }
        return true;
    }
}