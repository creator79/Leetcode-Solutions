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
    private boolean result = true;
    
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        
        isSubTreeBalanced(root);
        
        return result;
    }
    
    public int isSubTreeBalanced(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        int left = isSubTreeBalanced(root.left);
        int right = isSubTreeBalanced(root.right);
        
        int diff = (Math.abs(left-right));
        
        if(diff>1) {
            result = false;
        }
        
        return Math.max(left, right) + 1;
    }
}