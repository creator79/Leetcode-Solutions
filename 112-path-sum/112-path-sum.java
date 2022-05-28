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
    boolean ans = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if (root==null) return false;
        int subans= targetSum - root.val;
         if(subans==0 && root.left==null && root.right==null) return ans = true;
        
        if (root.left!=null){
            ans = ans || hasPathSum(root.left,subans);
        }
          if (root.right!=null){
            ans = ans || hasPathSum(root.right,subans);
        }
        
        return ans;
    }
    
}