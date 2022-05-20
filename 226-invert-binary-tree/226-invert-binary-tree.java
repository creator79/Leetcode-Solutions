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
    public TreeNode invertTree(TreeNode root) {
             if (root == null) return root; 
        
        TreeNode leftT  = invertTree(root.left);
        TreeNode rightT = invertTree(root.right);
        
        root.left = rightT;
        root.right= leftT;
        
        return root; 
    }
}
 
