class Solution {
public int removeDuplicates(int[] nums) {
int res = 0;
HashMap<Integer,Integer> map = new HashMap<>();
for (int i = 0; i < nums.length; i++) {
if (!map.containsKey(nums[i])) {
map.put(nums[i], 1);
nums[res++] = nums[i];
}
}
return res;
}
}
​