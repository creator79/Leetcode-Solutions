class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
//      implemantaion wise classic question
         int[] ans = new int[queries.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                sum += nums[i];
            }
            
        }
        for(int i = 0; i < queries.length; i++){
            int val = queries[i][0];
            int index = queries[i][1];
            if(nums[index] % 2 == 0){
                sum -= nums[index];
            }
            nums[index] += val;
            if(nums[index] % 2 == 0){
                sum += nums[index];
            }
            ans[i] = sum;
        }
        return ans;
    
        
    }
}