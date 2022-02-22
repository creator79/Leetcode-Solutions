// //Brute Force Approach (Linear Search) : 
// class Solution {
//     public int[] searchRange(int[] nums, int target) {

//       //Create Array to show result of occurence positions
//       //Initialize with -1, because if target is not found in an Array
//         int[] position = {-1, -1};

//        //Searching for First Occurrence, therefore search left to right
//         for(int i=0; i<nums.length; i++) {
//             if(nums[i] == target) {
//                 position[0] = i;
//                 break;         //because, here we only have to find first occurence 
//                                   //and not second ocuurence, third occurence , ...
//              }
//         }

//        //Searching for Last Occurrence, therefore search right to left
//         for(int i=nums.length-1; i>=0; i--) {
//             if(nums[i] == target) {
//                 position[1] = i;
//                 break;          //because, here we only have to find last occurence 
//                                    //and not second last ocuurence, third last ...
//              }
//         }

//         return position;
//     }
// }



//Optimized Approach (Binary Search) :
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        //Create Array to show result of occurence positions
        int[] ans = new int[2];
        
        ans[0] = firstOccur(nums, target);
        ans[1] = lastOccur(nums, target);
        
        return ans;
    }
    
    public int firstOccur(int[] nums, int target) {
        int start = 0 , end=nums.length-1;
        
        //Initialize with -1, because if target is not found in an Array
        int position=-1;
        
        while(start<=end) {
            int mid = (start + end) / 2;
            if(nums[mid] < target) {
                start = mid + 1;
            }
            else if(nums[mid] > target) {
                end = mid -1;
            }
            else {
                position = mid;
                
 //Above we found our target, but don't know that it is which occurence               
 //So, to find first occurence, also see elements which are at left of mid
                end = mid -1;
            }
        }
        return position;
    }
    
     public int lastOccur(int[] nums, int target) {
        int start = 0 , end=nums.length-1 , position=-1;
        while(start<=end) {
            int mid = (start + end) / 2;
            if(nums[mid] < target) {
                start = mid + 1;
            }
            else if(nums[mid] > target) {
                end = mid -1;
            }
            else {
                 position = mid;
                
 //Above we found our target, but don't know that it is which occurence  
 //So, to find last occurence, also see elements which are at right of mid
                 start = mid + 1;
            }
        }
        return position;
    }
    
}
