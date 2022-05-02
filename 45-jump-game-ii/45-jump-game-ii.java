class Solution {
    public int jump(int[] nums) {
        // Within previous one's jump range, the farest place you can jump each time 
        int far = 0;
        // used to store previous farest jump range 
        int farEnd = 0; 
        // how many times you have jumped 
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
             far = Math.max(far, i + nums[i]);
             if(farEnd == i) {
                 // if reach the farest range of previous jump, 
                 // need to set target range to new "far"
                 // count + 1, and reset far
                 count++;
                 farEnd = far;
                 far = 0;
             }
        }
        return count;
    }
}