class Solution {
    public int[] intersection(int[] nums1, int[] nums) {
           HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        int[] res = new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                res[k++]=nums[i];
                set.remove(nums[i]);
            }
        }
        return Arrays.copyOfRange(res,0,k);

    
    }
}