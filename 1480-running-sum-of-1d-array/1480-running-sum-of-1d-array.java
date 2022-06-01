class Solution {
    public int[] runningSum(int[] nums) {
        // prefix sum
       int runSum = 0;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; ++i)
        {
            runSum += nums[i];
            result[i] = runSum;  
        }
        return result;
        
    }
}



 
       