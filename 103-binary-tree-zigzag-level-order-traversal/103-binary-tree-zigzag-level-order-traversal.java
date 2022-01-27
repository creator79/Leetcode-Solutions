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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        List<List<Integer>> result = new ArrayList<>();
        stack1.add(root);
        
        result.add(new ArrayList<>());
        result.get(0).add(root.val);
        int level = 0;
        while(!stack1.isEmpty()){
            int size = stack1.size();
            level = 1 - level; // new level type (odd / even)
            List<Integer> ans = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode node = stack1.pop();
                if(level%2 != 0){ // if newLevel is odd then we have to add right first
                    addRight(node, stack2, ans);
                    addLeft(node, stack2, ans);
                }else{ // if newLevel is even then we have to add left first
                    addLeft(node, stack2, ans);
                    addRight(node, stack2, ans);
                }
            }
            /*
            if all nodes of current level has been checked and we found an non-empty answer from this level,
            we can add the same to our result.
            */ 
            if(!ans.isEmpty()){
                result.add(ans);
                stack1 = stack2;
                stack2 = new Stack<>();
            }
        }
        return result;
    }
    
    static void addLeft(TreeNode currNode, Stack<TreeNode> stack, List<Integer> res){
        if(currNode.left!=null){
            stack.add(currNode.left);
            res.add(currNode.left.val);
        }
    }
    
    static void addRight(TreeNode currNode, Stack<TreeNode> stack, List<Integer> res){
        if(currNode.right!=null){
            stack.add(currNode.right);
            res.add(currNode.right.val);
        }
    }
}