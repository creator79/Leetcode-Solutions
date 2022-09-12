class Solution {
    public int search(int[] nums, int target) {
         ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
  return arr.indexOf(target);

    }
}