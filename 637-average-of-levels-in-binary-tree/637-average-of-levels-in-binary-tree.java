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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int n=queue.size();
            double sum=0;
            for(int i=0;i<n;i++)
            {
                if(queue.peek().left!=null)
                    queue.add(queue.peek().left);
                if(queue.peek().right!=null)
                    queue.add(queue.peek().right);
                sum=sum+queue.poll().val;
            
            }
            double x=sum/n;
            ans.add(x);
        }
        return ans;
    }
}