class Solution {

    public int[] findErrorNums(int[] nums) {
        int arr[] = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (hm.get(nums[i]) > 1) {
                arr[0] = nums[i];
            }
            if (!hm.containsKey(i + 1)) {
                arr[1] = i + 1;
            }
        }
        return arr;
    }

    // public static int getMissingNo(int[] nums) {
    //     int n = nums.length;
    //     int sum = ((n + 1) * (n + 2)) / 2;
    //     for (int i = 0; i < n; i++) sum -= nums[i];
    //     return sum;
    // }
}
