class Solution {
    public void nextPermutation(int[] nums) {
      
// 2 Pointers initialized at the end of the array.
// 1st - Search for first decreasing element
// 2nd - Search for the first element greater than the first decreasing element.
// Remember that you are iterating from the end with both pointers.
// Swap index values of nums[i-1] and nums[j]
// The final step is to reverse the order of elements. Starting from index[i] to the end of nums.
// Important note: value of 'i' is at index position to the right of first decreasing, so we can just pass that into reverse.
// The challenge to this problem is keeping track of your pointers and knowing what to pass into your helper methods.
      
        int i = nums.length - 1;
        int j = nums.length - 1;
        
        while(i > 0 && nums[i] <= nums[i-1]) i--;
        
        if (i > 0) {
            while (j > 0 && nums[j] <= nums[i-1]) j--;
            swap(nums, i-1, j);
        }
        reverse(nums, i, nums.length - 1);
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int i, int j) {        
        while(i < j) {
            swap(nums, i++, j--);
        }
    }
}
        
   
