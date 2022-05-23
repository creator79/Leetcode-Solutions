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
    public boolean isSymmetric(TreeNode root) {
        if (root== null) return true;
        
       return helper (root.left,root.right);
    
    }
    
    boolean helper(TreeNode r,TreeNode s){

    if(r==null && s==null) return true;
    if(r==null || s==null) return false;
//         ek left agar dusre right ke baarabar hua toh symmetric hai
    return (r.val==s.val) && helper(r.left,s.right) && helper(r.right,s.left);
}
}