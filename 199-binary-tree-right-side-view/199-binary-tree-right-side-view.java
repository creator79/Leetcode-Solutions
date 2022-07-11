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
    List<Integer> result=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
  
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return result;
        }
        
        queue.add(root);
        
        while(queue.size()>0){
            int count=queue.size();
            
            while(count-->0){
                TreeNode ans=queue.remove();
                if(count==0){
                    result.add(ans.val);
                }
                
                if(ans.left!=null){
                    queue.add(ans.left);
                }
                
                if(ans.right!=null){
                    queue.add(ans.right);
                }
            }
            
        }
        return result;
          
    }
}