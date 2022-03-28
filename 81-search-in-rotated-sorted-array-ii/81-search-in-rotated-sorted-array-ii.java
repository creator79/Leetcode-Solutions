class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0, n = nums.length;
        int end = n-1;
        while(start <= end){
            int mid = start +(end-start)/2;
            if(target == nums[mid])
                return true;
            //If start, end and mid has same value then skip start and end end values
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start += 1;
                end -= 1;
            }
            //If start less than mid means first half is sorted so check in first half
            else if(nums[start] <= nums[mid]){
                //If start is less than target and target is less than mid then make
                //end = mid - 1 -- search in first part
                if(nums[start] <= target && target <= nums[mid])
                    end = mid - 1;
                //else make start = mid + 1 -- search in second part
                else
                    start = mid + 1;
            //If start greater than mid means second half is sorted so check in second half
            }else{
                //If mid is less than target and target less than end then make
                //start = mid + 1 -- search in second part
                if(nums[mid] <= target && target <= nums[end])
                    start = mid + 1;
                //else make end = mid - 1 --search in first part
                else
                    end = mid - 1;
            }
        }
        return false;
        //TC = O(N) || SC = O(1)
    }
}