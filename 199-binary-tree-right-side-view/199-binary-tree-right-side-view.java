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
class Solution 
{
    List<Integer> res= new ArrayList<>();//global ArrayList
    public List<Integer> rightSideView(TreeNode root) 
    {
        if(root == null)//base case for null tree
            return res;
        ArrayDeque<TreeNode> q= new ArrayDeque<>();//Queue can also be used, ArrayDeque is faster than Queue
        
        q.offerLast(root);//enqueing the root 
        
        while(!q.isEmpty())
        {//BFS whith reverse insertion order 
            int size= q.size();//popping constraint 
            for(int i= 0; i < size; i++)
            {
                TreeNode temp= q.pollFirst();
                
                if(i == 0)//first node 
                    res.add(temp.val);//only appending the first node in the level from right to left //left view of that particular level
                
                if(temp.right != null)//enqueing the right first to access it first 
                    q.offerLast(temp.right);
                if(temp.left != null)//enqueing the left after first to access it letter 
                    q.offerLast(temp.left);
            }
        }
        return res;//returning the ArrayList 
    }
}//Please do Upvote, it helps a lot