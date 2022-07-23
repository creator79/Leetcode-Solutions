class Solution {
//     nagarro question
   public int missingNumber(int[] nums) {
    int missing = 0, i = 0;
    while(i < nums.length)
       missing ^= i ^ nums[i++]; 
    return missing ^ i;
}
}