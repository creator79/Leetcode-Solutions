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
   public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode temp=root;
            root=new TreeNode(val);
            root.left=temp;
            
            return root;
        }
        
        return solve(root,1,val,depth);
    }
    
    private TreeNode solve(TreeNode root,int d,int val,int depth){
        if(root==null){
            return null;
        }
        
        if(d==depth-1){
            TreeNode tempL=root.left;
            TreeNode tempR=root.right;
            
            root.left=new TreeNode(val);
            root.right=new TreeNode(val);
            
            root.left.left=tempL;
            root.right.right=tempR;
        }else{
            root.left=solve(root.left,d+1,val,depth);
            root.right=solve(root.right,d+1,val,depth);
        }
        
        return root;
    }
}