/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
     // what   // sorted array me binary search lga dunga
      // how ---> nahi pta but start> end ek baad karunga
      // helper function --> mid +1 se left call mar dunga
       return helper(nums,0,nums.length-1);
      
    }
  public TreeNode helper(int[] nums, int s , int e) {
    if(s>e) return null;
    int mid = (s+e)/2;
    TreeNode node = new TreeNode(nums[mid]);
    node.left = helper(nums,s,mid-1);
     node.right = helper(nums,mid+1,e);
    return node;
  }
}