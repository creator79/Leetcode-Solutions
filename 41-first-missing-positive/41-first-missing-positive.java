class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean[] present = new boolean[nums.length];
    for (int num : nums) {
        if (num > 0 && num <= nums.length) {
            present[num - 1] = true;
        }
    }
    for (int i = 0; i < present.length; i++) {
        if (!present[i]) {
            return i + 1;
        }
    }
    return nums.length + 1;
    }
}