// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        
        // use -1 to denote the tree is not balanced
        // >= 0 value means the tree is balanced and it is the actual height of tree
        return height(root) != -1;
    }
    
    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        // if left subtree is already not balanced, we do not need to continue
        // and we can return -1 directly, same for right subtree
        int leftHeight = height(root.left);
        if (leftHeight == -1) return -1;
        
        int rightHeight = height(root.right);
        if (rightHeight == -1) return -1;
        
        // if not balanced, return -1
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}