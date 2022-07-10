class Solution {
    public int subarraySum(int[] nums, int k) {
        // two pointer se tle cnfrm 100 oercent cnfrm h
// prefix sum se kar sakte hai par interview ko apporach discuss kar lenge
//         toh yaha hash map ka apporach se solve kar sakt hai
     
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i : nums){
            sum += i;
            if (map.containsKey(sum - k)) count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
        