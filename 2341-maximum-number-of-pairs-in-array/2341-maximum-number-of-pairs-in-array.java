class Solution {

    public int[] numberOfPairs(int[] nums) {
        int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                count++;
                set.remove(nums[i]);
            }
        }
        result[0] = count;
        result[1] = set.size();

        return result;
    }
}
