class Solution {

    public int singleNonDuplicate(int[] nums) {
        // Binary Search
        //       int n = nums.length;
        //     int l = 0, r = n - 1;
        //     while (l < r) {
        //         int m = l + (r - l) / 2;
        //         if (m % 2 == 1) m--;
        //         if (nums[m] == nums[m + 1]) l = m + 2;
        //         else r = m;
        //     }
        //     return nums[l];

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~Hashmap~~~~~~~~~~~~~~~~~~~
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1) {
                return nums[i];
            }
        }
        return 0;

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~HashSet~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // HashSet<Integer> set = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (set.contains(nums[i])) {
        //         set.remove(nums[i]);
        //     } else {
        //         set.add(nums[i]);
        //     }
        // }
        // return set.iterator().next();
    }
}
