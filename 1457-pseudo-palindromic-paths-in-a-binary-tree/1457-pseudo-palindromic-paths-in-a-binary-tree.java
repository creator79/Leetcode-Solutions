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
    int count = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] list = new int[10];
        f(root,list);
        return count;
    }
    
    private void f(TreeNode root, int[] list){
        if(root == null) return;
        
        // If leaf node
        if(root.left==null && root.right==null) {
            // ++ leaf count 
            list[root.val]++;
            
            // check, can form palindrome?
            if(isPal(list))count++;
            
            // backtrack
            list[root.val]--;
            return;
        }
        
        // ++ root value
        list[root.val]++;
        
        // traverse left and right child
        f(root.left, list);
        f(root.right,list);
        
        // back track
        list[root.val]--;
    }
    
    private boolean isPal(int[] list){
        int odds = 0;
        for(int e : list){
            if((e&1)==1) odds++;
            if(odds>1)return false;
        }
        return true;
    }
}