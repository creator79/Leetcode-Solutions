class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
      // // Iterate for each length combination starting from k =3 till length. and keep on updating answer.

// public int numberOfArithmeticSlices(int[] nums) {
// 		int res = 0;
// 		//check total number of ap of k length
// 		for (int k = 3; k <= nums.length; k++) {
// 			res += totalAP(nums, k);
// 		}
// 		return res;
// 	}

// private int totalAP(int[] nums, int k) {
// 		int ans = 0;
// 		//sliding window of k size
// 		for (int i = k - 1; i < nums.length; i++) {
// 			int diff1 = nums[i - k + 2] - nums[i - k + 1];
//             int count = k-2;
//             //loop to check elements are in ap of k length starting from ith index
// 			for (int j = i; count > 0; j--, count--) {
// 				//if not same break loop
//                 if( diff1 != nums[j] - nums[j - 1]) {
//                     break;
//                 } 
// 			}
// 			//if all elements are in ap increase ans
// 			if (count==0) {
// 				ans++;
// 			}
// 		}
// 		return ans;
// 	}
//  Approach 2 -> DP
//  Apporach see in Notes Section

		int sum = 0;
		int curr = 0;
		for (int i = 2; i < nums.length; i++) {
			if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
				curr++;
				sum += curr;
			} else {
				curr = 0;
			}
		}
		return sum;    
    }
}