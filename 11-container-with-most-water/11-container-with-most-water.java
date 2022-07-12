// To get the maximum water, we can calculate using 2 loops. At each iteration, we require a distance between 2 lines and the minimum of those lines. So we start with i at 0 and j=i+1. Then calculate max at ar[i] for every other j. We keep a global max and when both loops are done, the value of the max is the answer.


// class Solution {
//     public int maxArea(int[] height) {
        
//         int i,j,mx=Integer.MIN_VALUE;
//         int n=height.length;
//         for(i=0;i<n;i++){
//             for(j=i+1;j<n;j++){
//                 int water = (j-i)*Math.min(height[j],height[i]);
//                     mx=Math.max(mx,water); 
//             }
//         }
        
//         return mx;       
//     }
// }

class Solution {
    public int maxArea(int[] ar) {
         int i=0,j=ar.length-1,mx=Integer.MIN_VALUE;
        while(i<j){
		int water= (j-i)*Math.min(ar[i],ar[j]);
		mx=Math.max(mx,water);
		if(ar[i]<ar[j])i++;
		else j--;
		
	}
        
        return mx;       
    }
}