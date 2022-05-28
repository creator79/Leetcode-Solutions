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
    
    static int ans=0;
    public int sumOfLeftLeaves(TreeNode root) {
        int res = 0;
  
        // Update result if root is not NULL
        if (root != null)
        {
            // If left of root is NULL, then add key of
            // left child
            if (isLeaf(root.left))
                res += root.left.val;
            else // Else recur for left child of root
                res += sumOfLeftLeaves(root.left);
  
            // Recur for right child of root and update res
            res += sumOfLeftLeaves(root.right);
        }
  
        // return result
        return res;
    }
  
    public boolean  isLeaf (TreeNode root)
    {
        if (root == null)
            return false;
        if (root.left == null && root.right == null)
            return true;
        return false;
    }
}