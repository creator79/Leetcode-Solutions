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
/*  ################   Philoshphy     #############*/
  // Its is prerequiste of  max width of binary tree and height of binary tree
  // max height {sum(left+right)} + node value
  // on every nod which is a longest path is what we return on maxi variable.
  // for maximum sum I never considerd a negative node
  
  // Striver
  public int maxPathSum(TreeNode root) {
        int maxValue[] = new int[1]; 
        maxValue[0] = Integer.MIN_VALUE;
        maxPathDown(root, maxValue);
        return maxValue[0];
    }
  private int maxPathDown(TreeNode node , int maxValue[]){
    if(node==null)return 0;
//      yaha pe zero likha hai means we not consider the negative value
    int left = Math.max(0,maxPathDown(node.left,maxValue));
     int right = Math.max(0,maxPathDown(node.right,maxValue));
    maxValue[0] = Math.max(maxValue[0],left+right+node.val);
    return Math.max(left,right)+ node.val;
  }
}
/***********************************************************************
class Solution {
    private int maxPathSum;

    public int maxPathSum(TreeNode root) {
        maxPathSum = Integer.MIN_VALUE;
        dfs(root);
        return maxPathSum;
    }
    
    private int dfs(TreeNode root) {
        if (root == null) return 0;
        int left = Math.max(dfs(root.left), 0);
        int right = Math.max(dfs(root.right), 0);
        int sum = Math.max(left, right) + root.val;
        int pathSum = left + right + root.val;
        maxPathSum = Math.max(maxPathSum, pathSum);
        return sum;
    }
}




/*******************************************************************************/



