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
    public boolean isValidBST(TreeNode root) {
        
        return isBST(root,null,null);
    }
    public boolean isBST(TreeNode root, TreeNode l, TreeNode r)
{
    // Base condition
    if (root == null)
        return true;
 
    // if left node exist then check it has
    // correct data or not i.e. left node's data
    // should be less than root's data
    if (l != null && root.val <= l.val)
        return false;
 
    // if right node exist then check it has
    // correct data or not i.e. right node's data
    // should be greater than root's data
    if (r != null && root.val >= r.val)
        return false;
 
    // check recursively for every node.
    return isBST(root.left, l, root) &&
        isBST(root.right, root, r);
}
}