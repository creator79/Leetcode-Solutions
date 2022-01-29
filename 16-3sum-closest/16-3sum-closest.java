class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans = 0;
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int total = nums[i]+nums[j]+nums[k];
                if(Math.abs(target-total)<minDiff){
                    minDiff=Math.abs(target-total);
                    ans = total;
                }
                if(total == target){
                    return target;
                }else if(total > target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return ans;
    }
}