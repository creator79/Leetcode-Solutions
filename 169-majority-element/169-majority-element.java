import java.util.*;

class Solution {

    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        int maxValue = 0;
        int mKey = 0;
        for (Integer key : hm.keySet()) {
            if (hm.get(key) > maxValue) {
                maxValue = hm.get(key);
                mKey = key;
            }
        }

        //         Map.Entry<Integer, Integer> maxEntry =
        //        Collections.max(hm.entrySet(),Map.Entry.comparingByValue());

        //         System.out.println(maxEntry.entrySet());

        return mKey;
    }
}
