class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
       
        // int [] sum = new int[n+1];
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                
                if(nums[i]+nums[j]==target)
                    return new int[]{i  , j };
                
                
            }
            
                 
        }
          return new int[]{-1 , -1};
           
        
    }
}