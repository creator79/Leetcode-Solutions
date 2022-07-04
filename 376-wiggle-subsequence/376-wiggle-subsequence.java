// There are three possible conditions:
// nums[i] > nums[i-1] : up position and element before down position
// nums[i] < nums[i-1] : down position and element before up position
// nums[i] == nums[i-1]
public class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length == 0) return 0;
        int up = 1, down = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) down = up + 1;
            else if (nums[i] > nums[i - 1]) up = down + 1;
        }
        return Math.max(up, down);
    }
}