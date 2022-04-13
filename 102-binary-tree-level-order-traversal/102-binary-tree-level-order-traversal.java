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
      public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root==null)
            return arr;
        q.add(root);
        
        while(q.size()!=0)
            
        {
            List<Integer> a = new ArrayList<>();
           
           int s = q.size();
      
           for(int i=0;i<s;i++)
           {
               TreeNode curr = q.poll();
               if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right); 
               a.add(curr.val);
           }
            arr.add(a);
        }
        
      return arr;
    }
}