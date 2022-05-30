/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    //print k levels down function 
    ArrayList<Integer> heapal=new ArrayList<>();
    public void  printklevelsdown(TreeNode root,int k,TreeNode blocker) {
        if(root==null || k<0 || root==blocker){
            
            return;
        }
        if(k==0){
            heapal.add(root.val);
        }
        
        printklevelsdown(root.left,k-1,blocker);
        printklevelsdown(root.right,k-1,blocker);
    }
    
    public ArrayList<TreeNode> ntr(TreeNode root,TreeNode data){
        if(root==null){
            return new ArrayList<>();
        }
        if(root==data){
            ArrayList<TreeNode> al=new ArrayList<>();
            al.add(root);
            return al;
        }
        
        ArrayList<TreeNode> left=ntr(root.left,data);
        if(left.size()>0){
            left.add(root);
            return left;
        }
        
         ArrayList<TreeNode> right=ntr(root.right,data);
        if(right.size()>0){
            right.add(root);
            return right;
        }
        
        return new ArrayList<>();
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        //find node to root path
        ArrayList<TreeNode> al=ntr(root,target);
        
        //traverse in that arraylist
        for(int i=0;i<al.size();i++){
            printklevelsdown(al.get(i),k-i,i==0?null:al.get(i-1));
        }
        
    
        
        return heapal;
        
    }
}