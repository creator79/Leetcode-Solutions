class Solution {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
//its will surely give me tle because 10^5 +10^5 = 10^10 (Not acceptable) Brute force submitted previously
         //solve using sliding window
        //use a tree set to store the elements in the window
        //if the element is already present in the tree set then return true
        //else add the element to the tree set
        //if the size of the tree set is greater than k then remove the first element from the tree set
        //if the element is not present in the tree set then find the floor and ceiling of the element
        //if the floor and ceiling are not null then check if the difference between the floor and ceiling is less than or equal to treeSet
        //if yes then return true
        //else add the element to the tree set
        //if the size of the tree set is greater than k then remove the first element from the tree set
        //return false
        
        // It is also a little variation of target pair sum
         if (nums == null || nums.length == 0 || indexDiff < 0 || valueDiff < 0) {
            return false;
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (set.floor(num) != null && num - set.floor(num) <= valueDiff
                    || set.ceiling(num) != null && set.ceiling(num) - num <= valueDiff) {
                return true;
            }
            set.add(num);
            if (i >= indexDiff) {
                set.remove(nums[i - indexDiff]);
            }
        }
        return false;
    
    
    }
}
