class Solution {
    public int minDeletion(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int n = 0; // for shifting operation
        int c = 0;
        for(int i = 0; i<nums.length-1; i++){
            if((i+n) % 2 == 0 && nums[i] == nums[i+1]){
                c++;
                n++;
            }
        }
        return (nums.length - c) % 2 == 0 ? c: c+1;
    }
}