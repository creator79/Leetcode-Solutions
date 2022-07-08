class Solution {
    public int findDuplicate(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (!set.add(nums[i])) {
                return nums[i];
            }
        }

        return len;
    }
}