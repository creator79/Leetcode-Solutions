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
    public int diameterOfBinaryTree(TreeNode root) {
   // yaha pe refrencing ki chiz nahi hota hai issliye diameter ko array type  banaya hai
        int[] diameter = new int[1];
        height (root,diameter);
//       jab diameter varibale ko array type ka banaya hai toh return bhi array type me hoga. 
        return diameter[0];
    }
  private int height (TreeNode node,int[] diameter){
    if (node == null){
      return 0;
    }
    int lh=height(node.left,diameter);
    int rh=height(node.right,diameter);
     // jab diameter varibale ko function me array type ka banaya hai toh return bhi array type me hoga. 
    diameter[0] = Math.max(diameter[0],lh+rh);
    return 1+Math.max(lh,rh);
  }
}
/********************************************************************************************************
class Solution {
    
    int diameter = 0;
    
    public int height(TreeNode root){
        
        // Algorithm: Result = Max value of (1 + left_subtree_height + right_subtree_height)
        
        // Step 1: Base case
        if(root == null){ return 0; }
        
        // Step 2: Calculate height of left sub tree
        int leftSubTreeHeight = height(root.left);
        
        // Step 3: Calculate height of right sub tree
        int rightSubTreeHeight = height(root.right);
        
        // Step 4: Find & store max value of (1 + left_height + right_height)
        diameter = Math.max(diameter, 1 + leftSubTreeHeight + rightSubTreeHeight);
        
        // Step 5: Return height of current node
        return 1 + Math.max(leftSubTreeHeight, rightSubTreeHeight);
        
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        // Step 0 : Calculate the height at each level & store the max value in 'diameter'
        height(root);
        
        return diameter - 1;
        
    }

/******************************************************************************************************


class Solution {
    
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        diameterCalculate(root);
        
        return max;
        
    }
    
    private int diameterCalculate(TreeNode root) {
        if (root == null) {
            return 0;
            
        } else {
            
            int left = diameterCalculate(root.left);
            int right = diameterCalculate(root.right);
            
            max = Math.max(left + right, max);
            
            return Math.max(left, right) + 1;
        }
    }
}


/********************************************************************************************************/














