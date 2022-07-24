class Solution {

    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos.add(nums[i]);
            }
        }
        ArrayList<Integer> neg = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                neg.add(nums[i]);
            }
        }
        int e1 = 0;
        int e2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = pos.get(e1);
                e1++;
            } else {
                nums[i] = neg.get(e2);
                e2++;
            }
        }
        return nums;
    }
}
